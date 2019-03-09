/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package moving.domain;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author josia
 */
public class Box implements Thing {

    private int maximumCapacity;
    private List<Thing> items = new ArrayList<Thing>();

    public Box(int maximumCapacity) {
        this.maximumCapacity = maximumCapacity;
    }

    public boolean addThing(Thing thing) {
        if (thing.getVolume() + getVolume() > this.maximumCapacity) {
            return false;
        } else {
            items.add(thing);
            return true;
        }
    }

    @Override
    public int getVolume() {
        int output = 0;
        for (Thing item : items) {
            output += item.getVolume();
        }
        return output;
    }

    @Override
    public String toString() {
        return "things in the box: " + getVolume() + " dm^3";
    }

}
