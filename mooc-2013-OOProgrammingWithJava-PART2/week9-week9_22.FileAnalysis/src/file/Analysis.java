/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package file;

import java.io.File;
import java.util.Scanner;

/**
 *
 * @author josia
 */
public class Analysis {

    private File file;

    public Analysis(File file) {
        this.file = file;
    }

    public int lines() throws Exception {
        int output = 0;
        Scanner reader = new Scanner(this.file, "UTF-8");
        while (reader.hasNextLine()) {
            reader.nextLine();
            output++;
        }
        return output;
    }

    public int characters() throws Exception {
        int output = 0;
        Scanner reader = new Scanner(this.file, "UTF-8");
        while (reader.hasNextLine()) {
            char[] allchars = reader.nextLine().toCharArray();
            output += allchars.length;
        }
        return output + lines();
    }
}
