/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author josia
 */
public class Airplane {

    private String id;
    private int capacity;

    public Airplane(String newID, int newCapacity) {
        this.id = newID;
        this.capacity = newCapacity;
    }

    public String getID() {
        return this.id;
    }

    public int getCapacity() {
        return this.capacity;
    }

    @Override
    public String toString() {
        return this.id + " (" + this.capacity + " ppl)";
    }
}
