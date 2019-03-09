/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package wormgame.domain;

/**
 *
 * @author josia
 */
public class Piece {

    int x;
    int y;

    public Piece(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public boolean runsInto(Piece piece) {
        return this.getX() == piece.getX() && this.getY() == piece.getY();
    }

    @Override
    public String toString() {
        return "(" + this.getX() + "," + this.getY() + ")";
    }

}
