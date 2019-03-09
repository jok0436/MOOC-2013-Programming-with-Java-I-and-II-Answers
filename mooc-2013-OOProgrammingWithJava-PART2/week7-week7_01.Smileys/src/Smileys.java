
public class Smileys {

    public static void main(String[] args) {
        // Test your method at least with the following
        printWithSmileys("Method");
        printWithSmileys("Beerbottle");
        printWithSmileys("Interface");
    }

    private static void printWithSmileys(String characterString) {
        int lengthToPrint = (characterString.length() / 2) + 3;
        if (characterString.length() % 2 == 1) {
            lengthToPrint++;
        }
        for (int i = 0; i < lengthToPrint; i++) {
            System.out.print(":)");
        }
        if (characterString.length() % 2 == 0) {
            System.out.println("\n:) " + characterString + " :)");
        } else {
            System.out.println("\n:) " + characterString + "  :)");
        }
        for (int i = 0; i < lengthToPrint; i++) {
            System.out.print(":)");
        }
        System.out.println("");
    }

}
