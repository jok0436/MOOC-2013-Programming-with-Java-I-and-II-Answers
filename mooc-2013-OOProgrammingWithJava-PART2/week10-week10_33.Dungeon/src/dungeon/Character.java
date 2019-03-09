/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dungeon;

/**
 *
 * @author josia
 */
public class Character {

    private int length;
    private int height;
    private final String name;
    public char symbol;

    public Character(String name) {
        this.name = name;
        if (this.name.equals("Player")) {
            this.symbol = '@';
        } else if (this.name.equals("Vampire")) {
            this.symbol = 'v';
        } else {
            this.symbol = '?';
        }
    }

    public void setLengthHeight(int length, int height) {
        this.length = length;
        this.height = height;
    }

    public int getHeight() {
        return height;
    }

    public int getLength() {
        return length;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return this.symbol + " " + this.getHeight() + " " + this.getLength();
    }

}
