
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

    Scanner reader = new Scanner(System.in);

    public void println(String output) {
        System.out.println(output);
    }

    public void print(String output) {
        System.out.print(output);
    }

    public void print2(String output) {
        System.out.println(output);
        System.out.println("");
    }

    public void printStart() {
        println("phone search\n"
                + "available operations:\n"
                + " 1 add a number\n"
                + " 2 search for a number\n"
                + " 3 search for a person by phone number\n"
                + " 4 add an address\n"
                + " 5 search for personal information\n"
                + " 6 delete personal information\n"
                + " 7 filtered listing\n"
                + " x quit\n");
    }

    public void printCommand() {
        print("command: ");
    }

    public void printWhoseNum() {
        print("whose number: ");
    }

    public void printNumber() {
        print("number: ");
    }

    public void printWhoseInfo() {
        print("whose information: ");
    }

    public void printWhoseAddress() {
        print("whose address: ");
    }

    public void printKeyword() {
        print("keyword (if empty, all listed): ");
    }

    public void printStreet() {
        print("street: ");
    }

    public void printCity() {
        print("city: ");
    }

    public String getInput() {
        return reader.nextLine();
    }
}
