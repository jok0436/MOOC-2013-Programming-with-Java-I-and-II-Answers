
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
public class Jump {

    private int distance;
    private int[] scores = new int[5];
    private Judge judge = new Judge();
    private Random random = new Random();
    private String whoJumped;

    public Jump(String who) {
        this.whoJumped = who;
    }

    public int getDistance() {
        return this.distance;
    }

    @Override
    public String toString() {
        return "  " + whoJumped + "\n" + "    length: " + distance + "\n"
                + "    judge votes: " + Arrays.toString(scores) + "\n";
    }

    public int[] getResults() {
        Arrays.sort(scores);
        int[] output = {scores[1], scores[2], scores[3]};
        return output;
    }

    public void getScores() {
        this.scores = judge.getJudged();
    }

    public void jump() {
        this.distance = random.nextInt(60) + 60;
        getScores();
    }

}
