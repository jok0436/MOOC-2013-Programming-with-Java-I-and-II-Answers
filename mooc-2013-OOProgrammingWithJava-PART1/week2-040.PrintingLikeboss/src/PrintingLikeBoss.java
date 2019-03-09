
public class PrintingLikeBoss {

    // copy or rewrite the method of Assignment 39.1 here
    public static void printStars(int amount) {
        for (int i = 0; i < amount; i++) {
            System.out.print("*");

        }
        System.out.println("");
    }

    public static void printWhitespaces(int amount) {
        // 40.1
        for (int i = 0; i < amount; i++) {
            System.out.print(" ");
        }
    }

    public static void printTriangle(int size) {
        // 40.2
        int stars = 1;
        int whitespace = size - 1;
        for (int i = 0; i < size; i++) {
            printWhitespaces(whitespace);
            printStars(stars);
            stars++;
            whitespace--;
        }
    }

    public static void xmasTree(int height) {
        // 40.3
        int stars = 1;
        int starsAtEnd = (height * 2) - 1;
        int whitespace = (starsAtEnd - 1) / 2;
        while (stars <= starsAtEnd) {
            printWhitespaces(whitespace);
            printStars(stars);
            stars += 2;
            whitespace -= 1;
        }
        int standWhitespace = (starsAtEnd - 3) / 2;
        printWhitespaces(standWhitespace);
        printStars(3);
        printWhitespaces(standWhitespace);
        printStars(3);
    }

    public static void main(String[] args) {
        // Tests do not use main, yo can write code here freely!

        printTriangle(5);
        System.out.println("---");
        xmasTree(4);
        System.out.println("---");
        xmasTree(10);
    }
}
