
import java.util.Scanner;

public class SumOfTheAges {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Type your name: ");
        String name_1 = reader.nextLine();
        System.out.println("Type your age: ");
        int age_1 = Integer.parseInt(reader.nextLine());
        System.out.println("\nType your name: ");
        String name_2 = reader.nextLine();
        System.out.println("Type your age: ");
        int age_2 = Integer.parseInt(reader.nextLine());
        int age_Total = age_1 + age_2;
        System.out.println("\n" + name_1 + " and " + name_2 + " are " + age_Total + " years old in total.");
        // Implement your program here
    }
}
