/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author josia
 */
public class BoundedCounter {

    private int value;
    private int upperLimit;

    public BoundedCounter(int upperLimit) {
        // write code here
        this.upperLimit = upperLimit;
        this.value = 0;
    }

    public void next() {
        // write code here
        this.value++;
        if (value > upperLimit) {
            value = 0;
        }

    }

    public String toString() {
        // write code here
        if (value < 10) {
            return "0" + value;
        }
        return Integer.toString(value);
    }

    public int getValue() {
        // write here code that returns the value
        return value;
    }

    public void setValue(int newValue) {
        if (newValue >= 0 && newValue <= upperLimit) {
            value = newValue;
        }
    }

}
