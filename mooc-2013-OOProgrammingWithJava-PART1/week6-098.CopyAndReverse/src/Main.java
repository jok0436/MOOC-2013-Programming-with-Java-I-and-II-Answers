
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        // write testcode here
        int[] t = {1, 2, 3};
        Main.copy(t);
    }

    public static int[] copy(int[] array) {
        int[] output = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            output[i] = array[i];
        }
        return output;
    }

    public static int[] reverseCopy(int[] array) {
        int[] output = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            output[i] = array[i];
        }
        for (int i = 0; i < output.length / 2; i++) {
            int temp = output[i];
            output[i] = output[output.length - i - 1];
            output[output.length - i - 1] = temp;
        }
        return output;
    }
}
