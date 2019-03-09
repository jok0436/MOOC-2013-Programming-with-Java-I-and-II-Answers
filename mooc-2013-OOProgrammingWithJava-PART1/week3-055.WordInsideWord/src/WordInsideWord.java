
import java.util.Scanner;

public class WordInsideWord {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Type the first word: ");
        String word = reader.nextLine();
        System.out.println("Type the second word: ");
        String wordSub = reader.nextLine();
        System.out.print("The word '" + wordSub + "' is ");
        if (word.indexOf(wordSub) != -1) {
            System.out.print("found ");
        } else {
            System.out.print("not found ");
        }
        System.out.println("in the word '" + word + "'.");

    }
}
