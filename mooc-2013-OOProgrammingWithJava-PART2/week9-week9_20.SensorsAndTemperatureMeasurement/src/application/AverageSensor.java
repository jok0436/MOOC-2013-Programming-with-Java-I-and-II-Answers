/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package application;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author josia
 */
public class AverageSensor implements Sensor {

    private ArrayList<Sensor> allSensors = new ArrayList<Sensor>();
    private List<Integer> allReadings = new ArrayList<Integer>();

    public void addSensor(Sensor additional) {
        allSensors.add(additional);
    }

    @Override
    public boolean isOn() {
        for (Sensor sensor : allSensors) {
            if (!sensor.isOn()) {
                return false;
            }
        }
        return true;
    }

    @Override
    public void on() {
        for (Sensor sensor : allSensors) {
            sensor.on();
        }
    }

    @Override
    public void off() {
        for (Sensor sensor : allSensors) {
            sensor.off();
        }
    }

    @Override
    public int measure() {
        if (allSensors.isEmpty() || !this.isOn()) {
            throw new IllegalStateException();
        } else {
            int output = 0;
            for (Sensor sensor : allSensors) {
                output += sensor.measure();
            }
            output = output / allSensors.size();
            allReadings.add(output);
            return output;
        }
    }

    public List<Integer> readings() {
        return this.allReadings;
    }

}
