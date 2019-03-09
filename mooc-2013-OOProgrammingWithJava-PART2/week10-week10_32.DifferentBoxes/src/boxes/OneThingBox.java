/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boxes;

/**
 *
 * @author josia
 */
public class OneThingBox extends Box {

    private Thing theThing;

    @Override
    public void add(Thing thing) {
        if (theThing == null) {
            theThing = thing;
        }
    }

    @Override
    public boolean isInTheBox(Thing thing) {
        if (theThing == null) {
            return false;
        } else {
            return thing.equals(theThing);
        }
    }

}
