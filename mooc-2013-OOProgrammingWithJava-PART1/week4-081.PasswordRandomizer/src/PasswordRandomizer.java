
import java.util.Random;

public class PasswordRandomizer {

    private int length;
    private Random random = new Random();

    public PasswordRandomizer(int length) {
        this.length = length;
        this.random = new Random();
    }

    public String createPassword() {
        String result = "";
        String symbols = "abcdefghijklmnopqrstuvwxyz";
        for (int i = 0; i < length; i++) {
            result += symbols.charAt(random.nextInt(26));
        }
        return result;
    }
}
