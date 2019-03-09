/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dungeon;

import java.util.ArrayList;
import java.util.Random;

/**
 *
 * @author josia
 */
public class DungeonBuilder {

    private int mapLength;
    private int mapHeight;
    private ArrayList<Character> characters;
    private Random random = new Random();

    public DungeonBuilder(int mapLength, int mapHeight, ArrayList<Character> characters) {
        this.mapLength = mapLength;
        this.mapHeight = mapHeight;
        this.characters = characters;
    }

    public ArrayList<Character> getCharacters() {
        return characters;
    }

    public String[][] generateMap() {
        String[][] map = new String[mapLength][mapHeight];
        map = this.fillNothingMap(map);
        for (Character character : characters) {
            map = this.placePerson(map, character);
        }
        map = this.fillBlanksMap(map);
        return map;
    }

    public String[][] placePerson(String[][] map, Character character) {
        if (character.getName().equals("Player")) {
            map[0][0] = "@";
            character.setLengthHeight(0, 0);
        } else {
            int randomLength = 0;
            int randomHeight = 0;
            do {
                randomLength = random.nextInt(map.length);
                randomHeight = random.nextInt(map[0].length);
            } while (!map[randomLength][randomHeight].equals(""));
            if (character.getName().equals("Vampire")) {
                map[randomLength][randomHeight] = "v";
                character.setLengthHeight(randomLength, randomHeight);
            }
        }
        return map;
    }

    public String[][] fillBlanksMap(String[][] map) {
        for (int i = 0; i < map.length; ++i) {
            for (int j = 0; j < map[i].length; ++j) {
                if (map[i][j].equals("")) {
                    map[i][j] = ".";
                }
            }
        }
        return map;
    }

    private String[][] fillNothingMap(String[][] map) {
        for (int i = 0; i < map.length; ++i) {
            for (int j = 0; j < map[i].length; ++j) {
                map[i][j] = "";
            }
        }
        return map;
    }
}
