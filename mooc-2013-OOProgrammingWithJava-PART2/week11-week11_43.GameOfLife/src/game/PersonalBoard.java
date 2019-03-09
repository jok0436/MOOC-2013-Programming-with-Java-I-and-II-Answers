/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package game;

import gameoflife.GameOfLifeBoard;
import java.util.Random;

/**
 *
 * @author josia
 */
public class PersonalBoard extends GameOfLifeBoard {

    private Random random = new Random();

    public PersonalBoard(int width, int height) {
        super(width, height);
    }

    @Override
    public void initiateRandomCells(double d) {
        for (int i = 0; i < this.getBoard().length; i++) {
            for (int j = 0; j < this.getBoard()[0].length; j++) {
                this.getBoard()[i][j] = random.nextDouble() <= d && d != 0;
            }
        }
    }

    @Override
    public boolean isAlive(int i, int i1) {
        if (this.checkLocation(i, i1)) {
            return this.getBoard()[i][i1];
        } else {
            return false;
        }
    }

    @Override
    public void turnToLiving(int i, int i1) {
        if (this.checkLocation(i, i1)) {
            this.getBoard()[i][i1] = true;
        }
    }

    @Override
    public void turnToDead(int i, int i1) {
        if (this.checkLocation(i, i1)) {
            this.getBoard()[i][i1] = false;
        }
    }

    @Override
    public int getNumberOfLivingNeighbours(int i, int i1) {
        int living = 0;
        int[][] values = {
            {-1, -1}, {-1, 0}, {-1, 1},
            {0, -1}, {0, 1},
            {1, -1}, {1, 0}, {1, 1}};
        for (int[] row : values) {
            int iCheck = i + row[0];
            int i1Check = i1 + row[1];
            if (isAlive(iCheck, i1Check)) {
                living++;
            }
        }
        return living;
    }

    @Override
    public void manageCell(int i, int i1, int i2) {
        if (i2 < 2 || i2 > 3) {
            this.turnToDead(i, i1);
        } else if (i2 == 3) {
            this.turnToLiving(i, i1);
        }
    }

    public boolean checkLocation(int i, int i1) {
        return (i >= 0 && i1 >= 0 && i <= this.getBoard().length - 1 && i1 <= this.getBoard()[0].length - 1);
    }
}
