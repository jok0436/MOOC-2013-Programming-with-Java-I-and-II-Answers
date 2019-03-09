
import java.util.Scanner;

public class Factorial {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Type a number: ");
        long number = Long.parseLong(reader.nextLine());
        long result = 1;
        for (int factor = 2; factor <= number; factor++) {
            result *= factor;
        }
        System.out.println("Factorial is " + result);
    }
}
