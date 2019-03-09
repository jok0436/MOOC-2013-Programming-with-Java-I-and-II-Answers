
public class Main {

    public static void main(String[] args) {
        Container container = new Container(1000);
        addSuitcasesFullOfBricks(container);
        System.out.println(container);
        // use this main class to test your program!
    }

    public static void addSuitcasesFullOfBricks(Container container) {
        for (int i = 1; i < 101; i++) {
            Thing brick = new Thing("brick", i);
            Suitcase suitcase = new Suitcase(i);
            suitcase.addThing(brick);
            container.addSuitcase(suitcase);
        }
    }

}
