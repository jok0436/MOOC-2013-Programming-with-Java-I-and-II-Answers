
import java.util.Scanner;

public class TheSumOfSetOfNumbers {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Until What? ");
        int highest = Integer.parseInt(reader.nextLine());
        int iamOne = 1;
        int sum = 0;
        while (iamOne <= highest) {
            sum += iamOne;
            iamOne++;
        }
        System.out.println("Sum is " + sum);
    }
}
