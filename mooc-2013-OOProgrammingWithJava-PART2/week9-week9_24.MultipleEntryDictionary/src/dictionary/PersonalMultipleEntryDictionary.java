/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dictionary;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 *
 * @author josia
 */
public class PersonalMultipleEntryDictionary implements MultipleEntryDictionary {

    private HashMap<String, List<String>> words = new HashMap<String, List<String>>();

    @Override
    public void add(String word, String entry) {
        List<String> empty = new ArrayList<String>();
        List<String> current = words.getOrDefault(word, empty);
        current.add(entry);
        words.put(word, current);

    }

    @Override
    public Set<String> translate(String word) {
        if (!words.containsKey(word)) {
            return null;
        }
        Set<String> output = new HashSet<String>();
        List<String> translations = words.get(word);
        for (String s : translations) {
            output.add(s);
        }
        return output;
    }

    @Override
    public void remove(String word) {
        words.remove(word);
    }

}
