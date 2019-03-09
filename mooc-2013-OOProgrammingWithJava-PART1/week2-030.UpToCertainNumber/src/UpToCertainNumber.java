
import java.util.Scanner;

public class UpToCertainNumber {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        // Write your code here
        System.out.println("What number do i count to? ");
        int highest = Integer.parseInt(reader.nextLine()) + 1;
        int number = 1;
        while (number != highest) {
            System.out.println(number);
            number++;
        }
    }
}
