
import java.util.Scanner;

public class Password {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        String password = "carrot"; // Use carrot as password when running tests.
        String userInput = "";
        while (!userInput.equals(password))
        {
            System.out.println("Type the password: ");
            userInput = reader.nextLine();
            if (!userInput.equals(password))
            {
                System.out.println("Wrong!");
            }
        }
        System.out.println("Right!");
        System.out.println("\nThe secret is: jryy qbar!");
        // Write your code here
    }
}
