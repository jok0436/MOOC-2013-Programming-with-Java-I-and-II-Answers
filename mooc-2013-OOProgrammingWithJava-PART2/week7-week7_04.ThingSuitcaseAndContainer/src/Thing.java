/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author josia
 */
public class Thing {

    private String name;
    private int weightKilo;

    public Thing(String newName, int newWeightKilo) {
        this.name = newName;
        this.weightKilo = newWeightKilo;
    }

    public String getName() {
        return this.name;
    }

    public int getWeight() {
        return this.weightKilo;
    }

    public String toString() {
        return this.name + " (" + this.weightKilo + "kg)";
    }
}
