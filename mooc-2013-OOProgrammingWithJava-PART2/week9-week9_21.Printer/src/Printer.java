
import java.io.File;
import java.io.Reader;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author josia
 */
public class Printer {

    private String fileName;
    private File file;

    public Printer(String fileName) throws Exception {
        this.fileName = fileName;
        this.file = new File(fileName);

    }

    public void printLinesWhichContain(String word) throws Exception {
        Scanner reader = new Scanner(file, "UTF-8");
        while (reader.hasNextLine()) {
            String line = reader.nextLine();
            if (line.contains(word) || word.equals("")) {
                System.out.println(line);
            }
        }
        reader.close();
    }
}
