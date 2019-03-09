
import java.util.Random;
import java.util.Scanner;

public class GuessingNumberGame {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int numberDrawn = drawNumber();

        // program your solution here. Do not touch the above lines!
        int guesses = 0;
        int input = -1;
        while (input != numberDrawn)
        {
            System.out.println("Guess a number: ");
            input = Integer.parseInt(reader.nextLine());
            guesses++;
            if (input > numberDrawn) {
                System.out.print("The number is lesser, ");
            }
            else if (input < numberDrawn) {
                System.out.print("The number is greater, ");
            }
            System.out.println("guesses made: " + guesses);
        }
        System.out.println("Congratulations, your guess is correct!");
    }

    // DO NOT MODIFY THIS!
    private static int drawNumber() {
        return new Random().nextInt(101);
    }
}
