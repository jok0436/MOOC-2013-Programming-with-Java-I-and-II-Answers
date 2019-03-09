/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package wordinspection;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author josia
 */
public class WordInspection {

    private File file;

    public WordInspection(File file) {
        this.file = file;
    }

    public int wordCount() throws Exception {
        Scanner reader = new Scanner(this.file, "UTF-8");
        int output = 0;
        while (reader.hasNextLine()) {
            reader.nextLine();
            output++;
        }
        reader.close();
        return output;
    }

    public List<String> wordsContainingZ() throws Exception {
        List<String> zWords = new ArrayList<String>();
        Scanner reader = new Scanner(this.file, "UTF-8");
        while (reader.hasNextLine()) {
            String line = reader.nextLine();
            if (line.contains("z")) {
                zWords.add(line);
            }
        }
        reader.close();
        return zWords;
    }

    public List<String> wordsEndingInL() throws Exception {
        List<String> zWords = new ArrayList<String>();
        Scanner reader = new Scanner(this.file, "UTF-8");
        while (reader.hasNextLine()) {
            String line = reader.nextLine();
            if (line.endsWith("l")) {
                zWords.add(line);
            }
        }
        reader.close();
        return zWords;
    }

    public List<String> palindromes() throws Exception {
        List<String> zWords = new ArrayList<String>();
        Scanner reader = new Scanner(this.file, "UTF-8");
        while (reader.hasNextLine()) {
            String line = reader.nextLine();
            line.trim();
//            String firstHalf = line.substring(0, line.length() / 2);
//            String secondHalf = line.substring(line.length() / 2 + 1, line.length());
            String reversed = new StringBuilder(line).reverse().toString();
            if (line.equals(reversed)) {
                zWords.add(line);
            }
        }
        reader.close();
        return zWords;
    }

    public List<String> wordsWhichContainAllVowels() throws Exception {
        List<String> zWords = new ArrayList<String>();
        Scanner reader = new Scanner(this.file, "UTF-8");
        while (reader.hasNextLine()) {
            String line = reader.nextLine();
            char[] lineChars = line.toCharArray();
            String finVowels = "aeiouyäö";
            char[] finVowelsArr = finVowels.toCharArray();
            boolean matches = true;
            for (char c : finVowelsArr) {
                for (int i = 0; i < lineChars.length; i++) {
                    if (c == lineChars[i]) {
                        break;
                    } else {
                        if (i + 1 == lineChars.length) {
                            matches = false;
                            break;
                        }
                    }
                }
            }
            if (matches) {
                zWords.add(line);
            }
        }
        reader.close();
        return zWords;
    }
}
