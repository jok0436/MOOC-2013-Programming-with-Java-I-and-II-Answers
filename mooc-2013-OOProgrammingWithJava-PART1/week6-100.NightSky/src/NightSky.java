
import java.util.Random;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author josia
 */
public class NightSky {

    private double density;
    private int width;
    private int height;
    private int starsLast = 0;

    public NightSky(double newDensity, int newWidth, int newHeight) {
        this.density = newDensity;
        this.width = newWidth;
        this.height = newHeight;
    }

    public NightSky(double density) {
        this(density, 20, 10);
    }

    public NightSky(int width, int height) {
        this(0.1, width, height);
    }

    public void printLine() {
        double roll = 3;
        Random random = new Random();
        for (int i = 0;
                i < width;
                i++) {
            roll = random.nextDouble();
            if (density >= roll) {
                System.out.print("*");
                starsLast++;
            } else {
                System.out.print(" ");
            }
        }
    }

    public int starsInLastPrint() {
        int output = starsLast;
        starsLast = 0;
        return output;

    }

    public void print() {
        for (int i = 0; i < height; i++) {
            this.printLine();
            System.out.println("");
        }
    }
}
