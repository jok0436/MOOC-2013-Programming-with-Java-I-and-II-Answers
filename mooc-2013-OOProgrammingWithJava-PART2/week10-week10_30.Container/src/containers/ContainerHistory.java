/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package containers;

import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author josia
 */
public class ContainerHistory {

    private ArrayList<Double> history = new ArrayList<Double>();

    public void add(double situation) {
        history.add(situation);
    }

    public void reset() {
        this.history.clear();
    }

    public String toString() {
        return history.toString();
    }

    public double maxValue() {
        double output = 0;
        for (double number : history) {
            if (number > output) {
                output = number;
            }
        }
        return output;
    }

    public double minValue() {
        double output = 9999999;
        for (double number : history) {
            if (number < output) {
                output = number;
            }
        }
        return output;
    }

    public double average() {
        if (history.size() > 0) {
            double output = 0;
            for (double number : history) {
                output += number;
            }
            return output / history.size();
        } else {
            return 0;
        }
    }

    public double greatestFluctuation() {
        double output = 0;
        if (!history.isEmpty() && history.size() > 1) {
            for (int i = 1; i < history.size(); i++) {
                double fluc = Math.abs(history.get(i) - history.get(i - 1));
                if (fluc > output) {
                    output = fluc;
                }
            }
        } else {
            return 0;
        }
        return output;
    }

    public double variance() {
        double output = 0;
        double average = this.average();
        for (double number : history) {
            output += Math.pow(number - average, 2);
        }
        return output / (history.size() - 1);
    }
}
