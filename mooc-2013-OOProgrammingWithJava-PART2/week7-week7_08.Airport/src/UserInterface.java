
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

    public String getStringUser() {
        System.out.print("> ");
        return reader.nextLine();
    }

    public String getStringUserNoGreaterThan() {
        return reader.nextLine();
    }

    public int getIntUser() {
        return Integer.parseInt(reader.nextLine());
    }

    public void start() {
        this.print("Airport panel\n"
                + "--------------------");
    }

    public void print(String output) {
        System.out.println(output);
    }

    public void printOperationsStats() {
        this.print("Choose operation:\n"
                + "[1] Print planes\n"
                + "[2] Print flights\n"
                + "[3] Print plane info\n"
                + "[x] Quit");
    }

    public void printOperations() {
        this.print("Choose operation:\n"
                + "[1] Add airplane\n"
                + "[2] Add flight\n"
                + "[x] Exit");
    }

    public void printFlightService() {
        this.print("Flight service\n"
                + "------------");
    }
}
