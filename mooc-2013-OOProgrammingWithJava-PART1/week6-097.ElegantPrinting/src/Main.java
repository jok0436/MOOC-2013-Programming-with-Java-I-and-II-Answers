
public class Main {

    public static void main(String[] args) {
        // test method here
        int[] array = {5, 1, 3, 4, 2};
        printElegantly(array);
    }

    public static void printElegantly(int[] array) {
        // Write code here
        String result = "";
        for (int i = 0; i < array.length; i++) {
            if (i != array.length - 1) {
                result += array[i] + ", ";
            } else {
                result += array[i];
            }
        }
        System.out.println(result);
    }
}
