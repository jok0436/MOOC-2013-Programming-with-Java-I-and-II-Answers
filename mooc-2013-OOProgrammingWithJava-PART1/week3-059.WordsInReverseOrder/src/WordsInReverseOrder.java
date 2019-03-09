
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class WordsInReverseOrder {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        ArrayList<String> words = new ArrayList<String>();
        String input = "wolololo";
        while (!"".equals(input)) {
            System.out.println("Type a word: ");
            input = reader.nextLine();
            words.add(input);
        }
        System.out.println("You typed the following words: ");
        Collections.reverse(words);
        for (String word : words) {
            System.out.println(word);
        }
    }
}
