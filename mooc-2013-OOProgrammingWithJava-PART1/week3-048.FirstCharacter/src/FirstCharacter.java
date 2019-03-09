
import java.util.Scanner;

public class FirstCharacter {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("What name? ");
        String input = reader.nextLine();
        System.out.println("First char: " + firstCharacter(input));
    }

    public static char firstCharacter(String text) {
        return text.charAt(0);
    }
}
