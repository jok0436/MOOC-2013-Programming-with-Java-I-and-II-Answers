/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package moving.logic;

import java.util.ArrayList;
import java.util.List;
import moving.domain.Box;
import moving.domain.Thing;

/**
 *
 * @author josia
 */
public class Packer {

    private int boxesVolume;

    public Packer(int boxesVolume) {
        this.boxesVolume = boxesVolume;
    }

    public List<Box> packThings(List<Thing> things) {
        List<Box> output = new ArrayList<Box>();
        List<Thing> removeThese = new ArrayList<Thing>();
        while (true) {
            Box newBox = new Box(boxesVolume);
            for (Thing thing : things) {
                if (newBox.addThing(thing)) {
                    removeThese.add(thing);
                } else {
                    break;
                }

            }
            output.add(newBox);
            things.removeAll(removeThese);
            removeThese.clear();
            if (things.isEmpty()) {
                break;
            }
        }
        return output;
    }
}
