
import java.util.Scanner;

public class ReversingText {

    public static String reverse(String text) {
        // write your code here
        // note that method does now print anything, it RETURNS the reversed string
        String reverse = "";
        for (int i = 0; i < text.length(); i++) {
            reverse += (text.charAt((text.length() - i - 1)));
        }
        return reverse;
    }

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("Type in your text: ");
        String text = reader.nextLine();
        System.out.println("In reverse order: " + reverse(text));
    }
}
