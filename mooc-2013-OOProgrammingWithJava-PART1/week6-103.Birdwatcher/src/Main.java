
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // implement your program here
        // do not put all to one method/class but rather design a proper structure to your program
        Scanner reader = new Scanner(System.in);
        // Your program should use only one Scanner object, i.e., it is allowed to call 
        // new Scanner only once. If you need scanner in multiple places, you can pass it as parameter
        ArrayList<BirdData> birds = new ArrayList<BirdData>();
        String input = "";
        while (!"Quit".equals(input)) {
            System.out.print("? ");
            input = reader.nextLine();
            if (input.equals("Add")) {
                birds.add(addBird(reader));
            } else if (input.equals("Observation")) {
                System.out.println("What was observed:? ");
                String subInput = reader.nextLine();
                if (observeBird(birds, subInput)) {

                } else {
                    System.out.println("Is not a bird!");
                }
            } else if (input.equals("Statistics")) {
                printAllBirds(birds);
            } else if (input.equals("Show")) {
                System.out.println("What? ");
                String subInput = reader.nextLine();
                printBird(birds, subInput);
            }
        }
    }

    public static boolean printBird(ArrayList<BirdData> birds, String input) {
        for (BirdData bird : birds) {
            if (bird.name.equals(input)) {
                bird.printBird();
                return true;
            }
        }
        System.out.println("Is not a bird!");
        return false;
    }

    public static BirdData addBird(Scanner reader) {
        String name = "";
        String latinName = "";
        System.out.println("Name: ");
        name = reader.nextLine();
        System.out.println("Latin Name: ");
        latinName = reader.nextLine();
        return new BirdData(name, latinName);
    }

    public static boolean observeBird(ArrayList<BirdData> birds, String input) {
        for (BirdData bird : birds) {
            if (bird.name.equals(input)) {
                bird.seenBird();
                return true;
            }
        }
        return false;
    }

    public static void printAllBirds(ArrayList<BirdData> birds) {
        for (BirdData bird : birds) {
            bird.printBird();
        }
    }

}
