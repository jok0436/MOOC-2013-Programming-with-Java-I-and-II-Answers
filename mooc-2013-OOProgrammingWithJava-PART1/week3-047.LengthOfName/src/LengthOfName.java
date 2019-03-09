
import java.util.Scanner;

public class LengthOfName {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("What name? ");
        System.out.println(calculateCharacters(reader.nextLine()));
    }

    // do here the method
    public static int calculateCharacters(String text) {
        return text.length();
    }

}
