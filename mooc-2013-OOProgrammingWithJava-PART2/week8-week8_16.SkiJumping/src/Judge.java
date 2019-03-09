
import java.util.Arrays;
import java.util.Random;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author josia
 */
public class Judge {

    private Random random = new Random();

    public int[] getJudged() {
        int[] results = new int[5];
        for (int i = 0; i < 5; i++) {
            int score = random.nextInt(10) + 10;
            results[i] = score;
        }
        return results;
    }
}
