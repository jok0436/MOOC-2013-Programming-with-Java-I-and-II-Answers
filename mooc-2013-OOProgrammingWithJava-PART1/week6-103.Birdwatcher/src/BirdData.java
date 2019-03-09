/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author josia
 */
public class BirdData {

    public String name;
    public String latinName;
    public int observed;

    public BirdData(String newName, String newLatinName) {
        this.name = newName;
        this.latinName = newLatinName;
        this.observed = 0;
    }

    public void seenBird() {
        this.observed++;
    }

    public void printBird() {
        System.out.println(this.name + " (" + this.latinName + "): " + this.observed + " observations");
    }
}
