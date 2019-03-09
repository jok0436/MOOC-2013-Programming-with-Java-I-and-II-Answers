
import java.util.Scanner;

public class TheSumBetweenTwoNumbers {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Start at? ");
        int iamOne = Integer.parseInt(reader.nextLine());
        System.out.println("Until What? ");
        int highest = Integer.parseInt(reader.nextLine());
        int sum = 0;
        while (iamOne <= highest) {
            sum += iamOne;
            iamOne++;
        }
        System.out.println("Sum is " + sum);
    }
}
