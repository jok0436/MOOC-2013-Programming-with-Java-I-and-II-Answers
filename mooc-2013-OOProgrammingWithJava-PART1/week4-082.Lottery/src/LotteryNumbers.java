
import java.util.ArrayList;
import java.util.Random;

public class LotteryNumbers {

    private ArrayList<Integer> numbers;
    private Random random = new Random();

    public LotteryNumbers() {
        // Draw numbers as LotteryNumbers is created
        this.drawNumbers();
    }

    public ArrayList<Integer> numbers() {
        return this.numbers;
    }

    public void drawNumbers() {
        // We'll format a list for the numbers
        this.numbers = new ArrayList<Integer>();
        int randomNumber = 0;
        // Write the number drawing here using the method containsNumber()
        for (int i = 0; i < 7; i++) {
            do {
                randomNumber = random.nextInt(39) + 1;
            } while (this.containsNumber(randomNumber));

            numbers.add(randomNumber);
        }
    }

    public boolean containsNumber(int number) {
        return numbers.contains(number);
    }
}
