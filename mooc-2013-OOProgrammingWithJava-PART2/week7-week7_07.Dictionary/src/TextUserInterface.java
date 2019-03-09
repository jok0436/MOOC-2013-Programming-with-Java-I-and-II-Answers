
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author josia
 */
public class TextUserInterface {

    private Scanner reader;
    private Dictionary dictionary;

    public TextUserInterface(Scanner reader, Dictionary dictionary) {
        this.reader = reader;
        this.dictionary = dictionary;
    }

    public void start() {
        String input = "";
        System.out.println("Statement: ");
        System.out.println("    add - adds a word pair to the dictionary");
        System.out.println("    translate - asks a word and prints its translation");
        System.out.println("    quit - quit the text user interface");
        while (!input.equals("quit")) {
            System.out.print("Statement: ");
            input = reader.nextLine();
            if (input.equals("quit")) {
                System.out.println("Cheers!");
                break;
            } else if (input.equals("add")) {
                this.add();
            } else if (input.equals("translate")) {
                this.translate();
            } else {
                System.out.println("Unknown statement");
            }
        }

    }

    public void add() {
        String input = "";
        String input2 = "";
        System.out.print("In Finnish: ");
        input = reader.nextLine();
        System.out.print("Translation: ");
        input2 = reader.nextLine();
        dictionary.add(input, input2);
    }

    public void translate() {
        System.out.print("Give a word: ");
        String input = reader.nextLine();
        System.out.println("Translation: " + dictionary.translate(input));
    }
}
