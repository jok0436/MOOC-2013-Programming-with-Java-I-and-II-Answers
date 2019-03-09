
import java.util.ArrayList;
import java.util.Collections;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author josia
 */
public class Tournament {

    private ArrayList<Skier> skiers = new ArrayList<Skier>();
    private int round = 0;

    public void addSkier(String name) {
        skiers.add(new Skier(name));
    }

    public void newRound() {
        round++;
    }

    public String jump() {
        allSkiersJump();
        return getResultsRound();
    }

    public String getResultsALL() {
        sortJumpingOrderAndReverse();
        String output = "";
        for (int i = 0; i < skiers.size(); i++) {
            output += (i + 1) + "           " + skiers.get(i).getResults();
        }
        return output.substring(0, output.length() - 1);
    }

    public String getResultsLast() {
        String output = "";
        for (Skier skier : skiers) {
            output += skier.getLastJumpResults();
        }
        return output.substring(0, output.length() - 1);
    }

    public void sortJumpingOrder() {
        Collections.sort(skiers);
    }

    public void sortJumpingOrderAndReverse() {
        Collections.sort(skiers);
        Collections.reverse(skiers);
    }

    public void allSkiersJump() {
        for (Skier skier : skiers) {
            skier.jump();
        }
    }

    public String printJumpingOrder() {
        newRound();
        sortJumpingOrder();
        String output = "Round " + round + "\n\n" + "Jumping order:\n";
        for (int i = 0; i < skiers.size(); i++) {
            output += "  " + (i + 1) + ". " + skiers.get(i).toString() + "\n";
        }
        return output;
    }

    public String getResultsRound() {
        String output = "\nResults of round " + round + "\n" + getResultsLast();
        return output;
    }
}
