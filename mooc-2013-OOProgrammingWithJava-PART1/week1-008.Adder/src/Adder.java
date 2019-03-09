
import java.util.Scanner;

public class Adder {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Type a number: ");
        int a = Integer.parseInt(reader.nextLine());
        System.out.println("Type another number: ");
        int b = Integer.parseInt(reader.nextLine());
        int ab = a + b;
        System.out.println("\nSum of the numbers: " + ab);

        // Implement your program here. Remember to ask the input from user
    }
}
