/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package farmsimulator;

import java.util.Random;

/**
 *
 * @author josia
 */
public class Cow implements Milkable, Alive {

    private String name;
    private int capacity = 15 + new Random().nextInt(26);
    private double volume = 0;
    private static final String[] NAMES = new String[]{
        "Anu", "Arpa", "Essi", "Heluna", "Hely",
        "Hento", "Hilke", "Hilsu", "Hymy", "Ihq", "Ilme", "Ilo",
        "Jaana", "Jami", "Jatta", "Laku", "Liekki",
        "Mainikki", "Mella", "Mimmi", "Naatti",
        "Nina", "Nyytti", "Papu", "Pullukka", "Pulu",
        "Rima", "Soma", "Sylkki", "Valpu", "Virpi"};

    public Cow() {
        this.name = NAMES[new Random().nextInt(31)];
    }

    public Cow(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public double getCapacity() {
        return this.capacity;
    }

    public double getAmount() {
        return this.volume;
    }

    @Override
    public double milk() {
        double tmp = this.volume;
        this.volume = 0;
        return tmp;

    }

    @Override
    public void liveHour() {
        double randomGrowth = (new Random().nextInt(14) + 7);
        randomGrowth /= 10;
        randomGrowth += volume;
        this.volume = Math.min(capacity, randomGrowth);
    }

    @Override
    public String toString() {
        return this.name + " " + Math.ceil(this.volume) + "/" + this.capacity;
    }

}
