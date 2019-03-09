package dictionary;

public class Main {

    public static void main(String[] args) {
        MindfulDictionary s = new MindfulDictionary("test/tmp/tmp35480.txt");
        s.add("tietokone", "computer");
        s.save();
    }
}
