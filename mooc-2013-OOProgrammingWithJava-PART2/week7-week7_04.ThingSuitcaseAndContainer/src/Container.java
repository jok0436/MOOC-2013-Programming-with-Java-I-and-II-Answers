
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
public class Container {

    private ArrayList<Suitcase> suitcases = new ArrayList<Suitcase>();
    private int maxWeight;

    public Container(int newMaxWeight) {
        this.maxWeight = newMaxWeight;
    }

    public void addSuitcase(Suitcase suitcase) {
        if (suitcase.totalWeight() + totalWeight() <= maxWeight) {
            suitcases.add(suitcase);
        }
    }

    public String toString() {
        String number = "";
        if (suitcases.size() == 0) {
            number = "empty ";
        } else if (suitcases.size() == 1) {
            number = "1 suitcase ";
        } else {
            number = suitcases.size() + " suitcases ";
        }
        int totalWeight = this.totalWeight();
        return number + "(" + totalWeight + " kg)";
    }

    public int totalWeight() {
        int output = 0;
        for (Suitcase suitcase : suitcases) {
            output += suitcase.totalWeight();
        }
        return output;
    }

    public void printThings() {
        for (Suitcase suitcase : suitcases) {
            suitcase.printThings();
        }
    }
}
