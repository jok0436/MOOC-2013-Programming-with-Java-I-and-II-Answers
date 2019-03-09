/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package containers;

/**
 *
 * @author josia
 */
public class ProductContainerRecorder extends ProductContainer {

    private ContainerHistory cHistory = new ContainerHistory();

    public ProductContainerRecorder(String productName, double capacity, double initialVolume) {
        super(productName, capacity);
        this.setVolume(initialVolume);
        cHistory.add(initialVolume);
    }

    public String history() {
        return cHistory.toString();
    }

    @Override
    public void addToTheContainer(double amount) {
        super.addToTheContainer(amount);
        cHistory.add(this.getVolume());
    }

    @Override
    public double takeFromTheContainer(double amount) {
        double output = super.takeFromTheContainer(amount);
        cHistory.add(this.getVolume());
        return output;
    }

    public void printAnalysis() {
        String output = "";
        output += "Product: " + this.getName() + "\n"
                + "History: " + this.history() + "\n"
                + "Greatest product amount: " + cHistory.maxValue() + "\n"
                + "Smallest product amount: " + cHistory.minValue() + "\n"
                + "Average: " + cHistory.average() + "\n"
                + "Greatest change: " + cHistory.greatestFluctuation()
                + "\n"
                + "Variance: " + cHistory.variance();
        System.out.println(output);
    }

}
