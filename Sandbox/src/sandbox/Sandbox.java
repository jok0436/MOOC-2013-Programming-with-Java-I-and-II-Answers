/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sandbox;

import java.util.Scanner;

/**
 *
 * @author josia
 */
public class Sandbox {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Scanner reader = new Scanner(System.in);

        int number = 1;

        System.out.println("First: ");
        int lowest = Integer.parseInt(reader.nextLine());

        System.out.println("Last: ");
        int highest = Integer.parseInt(reader.nextLine());

        while ((highest > lowest) && (number <= highest)) {

            System.out.println(number);
            number++;

        }
//        if (highest || lowest) {
//            System.out.println(number);
//        }

    }
}
