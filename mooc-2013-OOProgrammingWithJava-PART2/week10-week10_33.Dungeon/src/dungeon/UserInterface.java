/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dungeon;

import java.util.Scanner;

/**
 *
 * @author josia
 */
public class UserInterface {

    private Scanner reader = new Scanner(System.in);

    public void print(String toPrint) {
        System.out.print(toPrint);
    }

    public void printLn(String toPrint) {
        System.out.println(toPrint);
    }

    public String getInput() {
        String input = reader.nextLine();
        if (!input.matches(".*[^wasd].*")) {
            return input;
        } else {
            return "";
        }
    }

    public void printWin() {
        printLn("YOU WIN");
    }

    public void printLose() {
        printLn("YOU LOSE");
    }
}
