
import java.util.Scanner;

public class ReversingName {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Type your name: ");
        String input = reader.nextLine();
        String reverse = "";
        for (int i = 0; i < input.length(); i++) {
            reverse += (input.charAt((input.length() - i - 1)));
        }
        System.out.println("In reverse order: " + reverse);
    }
}
