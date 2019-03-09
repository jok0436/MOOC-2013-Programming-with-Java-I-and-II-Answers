
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write here the main program
        Scanner reader = new Scanner(System.in);
        String inputName = "";
        ArrayList<Student> list = new ArrayList<Student>();
        String inputNumber = "";
        do {
            System.out.print("name: ");
            inputName = reader.nextLine();
            if (inputName.equals("")) {
                break;
            }
            System.out.println("studentNumber: ");
            inputNumber = reader.nextLine();
            list.add(new Student(inputName, inputNumber));

        } while (true);
        for (Student student : list) {
            System.out.println(student.toString());
        }
        System.out.println("Give search term: ");
        String input = reader.nextLine();
        System.out.println("Result: ");
        for (Student student : list) {
            if (student.getName().contains(input)) {
                System.out.println(student.toString());
            }
        }

    }
}
