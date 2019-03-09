
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author josia
 */
public class Suitcase {

    private ArrayList<Thing> things = new ArrayList<Thing>();
    private int maxWeight;

    public Suitcase(int newMaxWeight) {
        this.maxWeight = newMaxWeight;
    }

    public void addThing(Thing thing) {
        int totalWeight = this.totalWeight();
        if (totalWeight + thing.getWeight() <= maxWeight) {
            this.things.add(thing);
        }
    }

    public String toString() {
        String number = "";
        if (things.size() == 0) {
            number = "empty ";
        } else if (things.size() == 1) {
            number = "1 thing ";
        } else {
            number = things.size() + " things ";
        }
        int totalWeight = this.totalWeight();
        return number + ")" + totalWeight + " kg)";
    }

    public int totalWeight() {
        int totalWeight = 0;
        for (Thing thing : things) {
            totalWeight += thing.getWeight();
        }
        return totalWeight;
    }

    public void printThings() {
        for (Thing thing : things) {
            System.out.println(thing);
        }
    }

    public Thing heaviestThing() {
        Thing heaviest = new Thing("Nothing", 0);
        for (Thing thing : things) {
            if (thing.getWeight() > heaviest.getWeight()) {
                heaviest = thing;
            }
        }
        if (heaviest.getWeight() == 0) {
            return null;
        }
        return heaviest;
    }
}
