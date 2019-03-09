
import java.util.ArrayList;
import java.util.HashMap;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author josia
 */
public class Dictionary {

    private HashMap<String, String> words = new HashMap<String, String>();

    public String translate(String word) {
        String result = null;
        result = words.getOrDefault(word, null);

        return result;
    }

    public void add(String word, String translation) {
        words.put(word, translation);
    }

    public int amountOfWords() {
        return words.size();
    }

    public ArrayList<String> translationList() {
        ArrayList<String> everything = new ArrayList<String>();
        for (String key : words.keySet()) {
            everything.add(key + " = " + words.get(key));
        }
        return everything;
    }
}
