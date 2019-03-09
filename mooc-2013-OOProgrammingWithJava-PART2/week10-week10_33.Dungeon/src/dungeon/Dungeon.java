/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dungeon;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Random;

/**
 *
 * @author josia
 */
public class Dungeon {

    private int length;
    private int height;
    private int vampires;
    private int moves;
    private boolean vampiresMove;
    private String[][] map;
    private ArrayList<Character> characters = new ArrayList<Character>();
    private DungeonBuilder builder;
    private Random random = new Random();
    private UserInterface ui = new UserInterface();

    public Dungeon(int length, int height, int vampires, int moves, boolean vampiresMove) {
        this.length = length;
        this.height = height;
        this.vampires = vampires;
        this.moves = moves;
        this.vampiresMove = vampiresMove;
        map = new String[length][height];
    }

    public void run() {
        buildMap();
        this.characters = builder.getCharacters();
        while (true) {
            ui.print(this.toString());
            String input = ui.getInput();
            if (!input.equals("")) {
                if (!this.move(input)) {
                    if (this.getMoves() > 0) {
                        ui.printWin();
                    } else {
                        ui.printLose();
                    }
                    break;
                }
            }
        }
    }

    public void buildMap() {
        buildCharacters();
        builder = new DungeonBuilder(this.length, this.height, this.characters);
        this.map = builder.generateMap();
    }

    public boolean move(String howMuch) {
        if (moves > 0) {
            this.moves--;
            for (int i = 0; i < howMuch.length(); i++) {
                this.moveCharacter(howMuch.charAt(i));
                this.moveAllVampires();
                if (this.allVampiresDead()) {
                    return false;
                } else if (moves <= 0) {
                    return false;
                }
            }
        } else if (moves <= 0) {
            return false;
        }
        return true;
    }

    public int getMoves() {
        return moves;
    }

    public void moveCharacter(char direction) {
        int[] newPos = calculateNewPosWithDirection(direction);
        Character theCharacter = this.getThePlayer();
        int currentLength = theCharacter.getLength();
        int currentHeight = theCharacter.getHeight();
        int newLength = currentLength + newPos[0];
        int newHeight = currentHeight + newPos[1];
        if (this.checkMovement(newLength, newHeight)) {
            if (this.checkSpaceVampire(newLength, newHeight)) {
                this.removeCharacter(this.getCharacterAt(newLength, newHeight)); //KILL THE EVIL!!!
            }
            this.map[currentLength][currentHeight] = ".";
            this.map[newLength][newHeight] = "@";
            theCharacter.setLengthHeight(newLength, newHeight);
        }
    }

    public void moveVampire(Character vampire) {
        if (vampiresMove) {
            int newLength = vampire.getLength() + (random.nextInt(2) - 1);
            int newHeight = vampire.getHeight() + (random.nextInt(2) - 1);
            if (this.checkMovement(newLength, newHeight)) {
                if (!this.checkSpaceVampire(newLength, newHeight)) {
                    if (this.checkSpacePlayer(newLength, newHeight)) {
                        this.removeCharacter(vampire);
                    } else {
                        this.map[vampire.getLength()][vampire.getHeight()] = ".";
                        this.map[newLength][newHeight] = "v";
                        vampire.setLengthHeight(newLength, newHeight);

                    }
                }
            }
        }
    }

    public Character getCharacterAt(int length, int height) {
        for (Character character : characters) {
            if (character.getLength() == length && character.getHeight() == height) {
                return character;
            }
        }
        return null;
    }

    public boolean checkMovement(int length, int height) {
        return !(length > this.map.length - 1 || length < 0 || height > this.map[0].length - 1 || height < 0);
    }

    public boolean checkSpaceVampire(int length, int height) {
        return this.map[length][height].equals("v");
    }

    public boolean checkSpacePlayer(int length, int height) {
        return this.map[length][height].equals("@");
    }

    public void removeCharacter(Character character) {
        this.map[character.getLength()][character.getHeight()] = ".";
        characters.remove(character);
    }

    public void buildCharacters() {
        Character player = new Character("Player");
        this.characters.add(player);
        for (int i = 0; i < this.vampires; i++) {
            characters.add(new Character("Vampire"));
        }
    }

    @Override
    public String toString() {
        return this.moves
                + "\n"
                + "\n"
                + this.allCharactersToString()
                + "\n"
                + this.getMapToString()
                + "\n";
    }

    private String allCharactersToString() {
        String output = "";
        for (Character character : characters) {
            output += character.toString() + "\n";
        }
        return output;
    }

    private String getMapToString() {
        String output = "";
        for (String[] row : map) {
            for (String value : row) {
                output += value;
            }
            output += "\n";
        }
        return output;
    }

    private int[] calculateNewPosWithDirection(char direction) {
        int[] output = new int[]{0, 0};
        switch (direction) {
            case 'w':
                output[0] = -1;
                break;
            case 'a':
                output[1] = -1;
                break;
            case 's':
                output[0] = 1;
                break;
            case 'd':
                output[1] = 1;
                break;
            default:
                break;
        }
        return output;
    }

    private void moveAllVampires() {
        for (Character character : characters) {
            if (character.getName().equals("Vampire")) {
                this.moveVampire(character);
            }
        }
    }

    private boolean allVampiresDead() {
        for (Character character : characters) {
            if (character.getName().equals("Vampire")) {
                return false;
            }
        }
        return true;
    }

    private Character getThePlayer() {
        for (Character character : characters) {
            if (character.getName().equals("Player")) {
                return character;
            }
        }
        return null;
    }

}
