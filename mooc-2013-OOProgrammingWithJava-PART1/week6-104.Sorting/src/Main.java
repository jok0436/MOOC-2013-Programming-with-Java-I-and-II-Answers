
public class Main {

    public static void main(String[] args) {
        // write testcode here
    }

    public static void sort(int[] array) {
        boolean swapped = true;
        int j = 0;
        int tmp;
        while (swapped) {
            swapped = false;
            j++;
            for (int i = 0; i < array.length - j; i++) {
                if (array[i] > array[i + 1]) {
                    tmp = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = tmp;
                    swapped = true;
                    System.out.println(array);
                }
            }
        }
    }

    public static int smallest(int[] array) {
        // write the code here
        int smallest = 99999999;
        for (int i = 0; i < array.length; i++) {
            if (array[i] < smallest) {
                smallest = array[i];
            }
        }
        return smallest;
    }

    public static int indexOfTheSmallest(int[] array) {
        // code goes here
        // write the code here
        int smallest = 99999999;
        int index = 999999;
        for (int i = 0; i < array.length; i++) {
            if (array[i] < smallest) {
                smallest = array[i];
                index = i;
            }
        }
        return index;
    }

    public static int indexOfTheSmallestStartingFrom(int[] array, int index) {
        // write the code here        // code goes here
        // write the code here
        int smallest = 99999999;
        int index2 = 999999;
        for (int i = index; i < array.length; i++) {
            if (array[i] < smallest) {
                smallest = array[i];
                index2 = i;
            }
        }
        return index2;
    }

    public static void swap(int[] array, int index1, int index2) {
        // code goes here
        int temp = array[index1];
        array[index1] = array[index2];
        array[index2] = temp;
    }
}
