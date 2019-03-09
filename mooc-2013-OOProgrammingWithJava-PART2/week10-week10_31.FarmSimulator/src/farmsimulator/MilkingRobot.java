/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package farmsimulator;

/**
 *
 * @author josia
 */
public class MilkingRobot {

    private BulkTank tank;

    public MilkingRobot() {
    }

    public BulkTank getBulkTank() {
        return this.tank;
    }

    public void setBulkTank(BulkTank tank) {
        this.tank = tank;
    }

    public void milk(Milkable milkable) {
        if (this.tank != null) {
            this.tank.addToTank(milkable.milk());
        } else {
            throw new IllegalStateException("The MilkingRobot hasn't been installed");
        }
    }

}
