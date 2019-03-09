/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boxes;

import java.util.ArrayList;

/**
 *
 * @author josia
 */
public class MaxWeightBox extends Box {

    private int maxWeight;
    private ArrayList<Thing> things = new ArrayList<Thing>();

    public MaxWeightBox(int maxWeight) {
        this.maxWeight = maxWeight;
    }

    public int getCurrentWeight() {
        int output = 0;
        for (Thing thing : things) {
            output += thing.getWeight();
        }
        return output;
    }

    @Override
    public void add(Thing thing) {
        if (thing.getWeight() + getCurrentWeight() <= maxWeight) {
            things.add(thing);
        }
    }

    @Override
    public boolean isInTheBox(Thing thing) {
        for (Thing thingBox : things) {
            if (thingBox.equals(thing)) {
                return true;
            }
        }
        return false;
    }

}
