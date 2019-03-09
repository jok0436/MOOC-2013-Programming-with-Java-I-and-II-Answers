/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dictionary;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map.Entry;
import java.util.Scanner;

/**
 *
 * @author josia
 */
public class MindfulDictionary {

    private HashMap<String, String> words = new HashMap<String, String>();
    private String file;
    private Scanner fileReader;

    public MindfulDictionary() {
    }

    public MindfulDictionary(String file) {
        this.file = file;
    }

    public boolean load() {
        try {
            fileReader = new Scanner(new File(this.file));
        } catch (Exception e) {
            return false;
        }
        while (fileReader.hasNextLine()) {
            String line = fileReader.nextLine();
            String[] parts = line.split(":");
            words.put(parts[0], parts[1]);
        }
        return true;
    }

    public void add(String word, String translation) {
        if (!words.containsKey(word)) {
            words.put(word, translation);
        }
    }

    public String translate(String word) {
        if (words.containsKey(word)) {
            return words.get(word);
        } else if (words.containsValue(word)) {
            return this.getKeyFromValue(words, word);
        }
        return null;
    }

    public void remove(String word) {
        if (words.containsKey(word)) {
            words.remove(word);
        } else if (words.containsValue(word)) {
            words.remove(this.getKeyFromValue(words, word));
        }
    }

    public String getKeyFromValue(HashMap<String, String> words, String value) {
        for (Entry<String, String> entry : words.entrySet()) {
            if (entry.getValue().equals(value)) {
                return entry.getKey();
            }
        }
        return null;
    }

    public boolean save() {
        FileWriter writer;
        try {
            writer = new FileWriter(this.file);
            String output = "";
            for (String key : words.keySet()) {
                String value = words.get(key);
                output += key + ":" + value + "\n";
            }
            writer.write(output);
            writer.close();
        } catch (Exception e) {
            return false;
        }
        return true;
    }
}
