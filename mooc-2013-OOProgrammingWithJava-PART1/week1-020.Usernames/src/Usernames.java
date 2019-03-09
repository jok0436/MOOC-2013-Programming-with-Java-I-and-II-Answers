
import java.util.Scanner;

public class Usernames {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        String[] loginData_1 = {"alex", "mightyducks"};
        String[] loginData_2 = {"emily", "cat"};
//        String savedName1 = "alex";
//        String savedPassword1 = "mightyducks";
//        String savedName2 = "emily";
//        String savedPassword2 = "cat";
        System.out.println("Type your username: ");
        String inputUser = reader.nextLine();
        System.out.println("Type your password: ");
        String inputPassword = reader.nextLine();
        String[] inputData = {inputUser, inputPassword};
        if ((inputData[0].equals(loginData_1[0]) && inputData[1].equals(loginData_1[1])) || (inputData[0].equals(loginData_2[0]) && inputData[1].equals(loginData_2[1]))) {
            System.out.println("You are now logged into the system!");
        } else {
            System.out.println("Your username or password was invalid!");
        }
    }
}
