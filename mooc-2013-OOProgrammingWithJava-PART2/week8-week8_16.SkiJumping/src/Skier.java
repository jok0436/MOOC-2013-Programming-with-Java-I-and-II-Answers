
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
public class Skier implements Comparable<Skier> {

    private ArrayList<Jump> jumps = new ArrayList<Jump>();
    private String name;

    public Skier(String newName) {
        this.name = newName;
    }

    public void jump() {
        Jump jump = new Jump(this.name);
        jump.jump();
        jump.getScores();
        jumps.add(jump);
    }

    public int getTotalScores() {
        int output = 0;
        int[] tmp = new int[3];
        for (Jump jump : jumps) {
            tmp = jump.getResults();
            for (int score : tmp) {
                output += score;
            }
            output += jump.getDistance();
        }
        return output;
    }

    @Override
    public String toString() {
        return name + " (" + getTotalScores() + " points)";
    }

    public String getAllJumpLengths() {
        String output = "";
        for (Jump jump : jumps) {
            output += " " + jump.getDistance() + " m,";
        }
        return output.substring(0, output.length() - 1);
    }

    public String getResults() {
        String output = this.name + " (" + getTotalScores() + ")\n"
                + "            jump lengths: " + getAllJumpLengths();

        return output + "\n";
    }

    public String getLastJumpResults() {
        return jumps.get(jumps.size() - 1).toString();
    }

    @Override
    public int compareTo(Skier otherSkier) {
        return this.getTotalScores() - otherSkier.getTotalScores();
    }
}
