/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package application;

import java.util.Random;

/**
 *
 * @author josia
 */
public class Thermometer implements Sensor {

    private boolean isOn = false;
    private Random random = new Random();

    @Override
    public boolean isOn() {
        return this.isOn;
    }

    @Override
    public void on() {
        this.isOn = true;
    }

    @Override
    public void off() {
        this.isOn = false;
    }

    @Override
    public int measure() {
        if (this.isOn) {
            return random.nextInt(60) - 30;
        } else {
            throw new IllegalStateException("Its off you idiot!");
        }
    }

}
