/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package farmsimulator;

import java.util.ArrayList;

/**
 *
 * @author josia
 */
public class Farm implements Alive {

    private String owner;
    private Barn barn;
    private ArrayList<Cow> cows = new ArrayList<Cow>();

    public Farm(String owner, Barn barn) {
        this.owner = owner;
        this.barn = barn;
    }

    @Override
    public void liveHour() {
        for (Cow cow : cows) {
            cow.liveHour();
        }
    }

    public String getOwner() {
        return owner;
    }

    public void manageCows() {
        this.barn.takeCareOf(cows);
    }

    public void addCow(Cow cow) {
        this.cows.add(cow);
    }

    @Override
    public String toString() {
        String output = "Farm owner: " + this.owner
                + "\n"
                + "Barn bulk tank: " + this.barn.toString() + "\n";
        if (cows.isEmpty()) {
            output += "No cows.\n";
        } else {
            output += "Animals:";
            for (Cow cow : cows) {
                output += "\n        " + cow.toString();
            }
        }
        return output;
    }

    public void installMilkingRobot(MilkingRobot robot) {
        this.barn.installMilkingRobot(robot);
    }
}
