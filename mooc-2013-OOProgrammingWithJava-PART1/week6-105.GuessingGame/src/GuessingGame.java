
import java.util.Scanner;

public class GuessingGame {

    private Scanner reader;

    public GuessingGame() {
        // use only this scanner, othervise the tests do not work
        this.reader = new Scanner(System.in);
    }

    public void play(int lowerLimit, int upperLimit) {
        instructions(lowerLimit, upperLimit);
        int[] lowerUpper = {lowerLimit, upperLimit};
        int currentAverage = 0;
        while (lowerUpper[1] != lowerUpper[0]) {
            currentAverage = average(lowerUpper[0], lowerUpper[1]);
            if (isGreaterThan(currentAverage)) {
                lowerUpper[0] = currentAverage + 1;
            } else {
                lowerUpper[1] = currentAverage;
            }
        }
        System.out.println("The number you're thinking of is " + (lowerUpper[1]));
        // write the guessing logic here

    }

    public boolean isGreaterThan(int average) {
        String input = "";
        System.out.println("Is your number greater than " + average + "? (y/n)");
        input = reader.nextLine();
        if (input.equals("y")) {
            return true;
        } else if (input.equals("n")) {
            return false;
        }
        return false;
    }

    public int average(int first, int second) {
        return (first + second) / 2;
    }

    // implement here the methods isGreaterThan and average
    public void instructions(int lowerLimit, int upperLimit) {
        int maxQuestions = howManyTimesHalvable(upperLimit - lowerLimit);

        System.out.println("Think of a number between " + lowerLimit + "..." + upperLimit + ".");

        System.out.println("I promise you that I can guess the number you are thinking with " + maxQuestions + " questions.");
        System.out.println("");
        System.out.println("Next I'll present you a series of questions. Answer them honestly.");
        System.out.println("");
    }

    // a helper method:
    public static int howManyTimesHalvable(int number) {
        // we create a base two logarithm  of the given value

        // Below we swap the base number to base two logarithms!
        return (int) (Math.log(number) / Math.log(2)) + 1;
    }
}
