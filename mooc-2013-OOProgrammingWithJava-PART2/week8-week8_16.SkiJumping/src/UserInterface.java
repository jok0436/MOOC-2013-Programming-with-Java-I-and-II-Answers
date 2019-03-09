
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
public class UserInterface {

    private Scanner reader = new Scanner(System.in);

    public void print(String toPrint) {
        System.out.println(toPrint);
    }

    public String getInput() {
        return reader.nextLine();
    }

    public void printStart() {
        print("Kumpula ski jumping week");
        print("");
        print("Write the names of the participants one at a time; an empty string brings you to the jumping phase.");
    }

    public void printParticipantString() {
        System.out.print("  Participant name: ");
    }

    public void printTournament() {
        print("");
        print("The tournament begins!");
    }

    public String printJumpGetInput() {
        print("");
        System.out.print("Write \"jump\" to jump; otherwise you quit: ");
        String input = this.getInput();
        print("");
        return input;
    }

    public void printEnd() {
        print("Thanks!\n"
                + "\n"
                + "Tournament results:\n"
                + "Position    Name\n");
    }
}
