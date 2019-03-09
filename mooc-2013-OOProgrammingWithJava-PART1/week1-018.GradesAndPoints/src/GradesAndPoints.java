
import java.util.Scanner;

public class GradesAndPoints {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Type the points [0-60]: ");
        int a = Integer.parseInt(reader.nextLine());
        String grade = "failed";
        if (a < 30) {
            
        }
        else if (a <= 34) {
            grade = "1";
        }
        else if (a <= 39) {
            grade = "2";
        }
        else if (a <= 44) {
            grade = "3";
        }
        else if (a <= 49) {
            grade = "4";
        }
        else if (a <= 60) {
            grade = "5";
        }
        System.out.println("Grade: " + grade);
    }
}
