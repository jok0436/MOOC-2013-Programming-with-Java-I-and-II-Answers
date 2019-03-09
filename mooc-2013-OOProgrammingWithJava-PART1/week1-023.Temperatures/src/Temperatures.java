
import java.util.Scanner;

public class Temperatures {

    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);
        // Write your code here. 
        while (true) {
            System.out.println("Input for graph: ");
            double input = Double.parseDouble(reader.nextLine());
            if (input > 40 || input < -30) {
                System.out.println("Cannot Add!");
            } else {
                Graph.addNumber(input);
            }
        }

        // Graph is used as follows:
        // Remove or comment out these lines above before trying to run the tests.
    }
}
