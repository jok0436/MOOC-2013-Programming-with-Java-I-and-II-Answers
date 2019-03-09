/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tools;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author josia
 */
public class PersonalDuplicateRemover implements DuplicateRemover {

    private int duplicates = 0;
    private Set<String> words = new HashSet<String>();

    @Override
    public void add(String characterString) {
        if (words.contains(characterString)) {
            duplicates++;
        } else {
            words.add(characterString);
        }
    }

    @Override
    public int getNumberOfDetectedDuplicates() {
        return duplicates;
    }

    @Override
    public Set<String> getUniqueCharacterStrings() {
        return words;
    }

    @Override
    public void empty() {
        duplicates = 0;
        words = new HashSet<String>();
    }

}
