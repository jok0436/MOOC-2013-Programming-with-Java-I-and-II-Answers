
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        int input = 0;
        ArrayList<Integer> allResults = new ArrayList<Integer>();
        System.out.println("Type exam scores, -1 completes:");
        while (input != -1) {
            input = Integer.parseInt(lukija.nextLine());
            if (input >= 0 && input <= 60) {
                allResults.add(input);
            }
        }
        System.out.println("Grade distribution:");
        System.out.println("5: " + returnStars(allResults, 50, 60));
        System.out.println("4: " + returnStars(allResults, 45, 49));
        System.out.println("3: " + returnStars(allResults, 40, 44));
        System.out.println("2: " + returnStars(allResults, 35, 39));
        System.out.println("1: " + returnStars(allResults, 30, 34));
        System.out.println("0: " + returnStars(allResults, 0, 29));
        System.out.println("Acceptance percentage: " + calculateAverage(allResults));

    }

    public static String returnStars(ArrayList<Integer> array, int rangeStart, int rangeEnd) {
        Collections.sort(array);
        String output = "";
        for (int number : array) {
            if (number >= rangeStart && number <= rangeEnd) {
                output += "*";
            }
        }
        return output;
    }

    public static double calculateAverage(ArrayList<Integer> array) {
        double totalStudents = 0;
        double accepted = 0;
        for (int number : array) {
            totalStudents++;
            if (number > 29) {
                accepted++;
            }
        }
        return 100 * (accepted / totalStudents);
    }
}
