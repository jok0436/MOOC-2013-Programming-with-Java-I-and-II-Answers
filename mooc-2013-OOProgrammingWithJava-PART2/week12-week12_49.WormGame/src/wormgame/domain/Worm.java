/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package wormgame.domain;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;
import wormgame.Direction;

/**
 *
 * @author josia
 */
public class Worm {

    private int x;
    private int y;
    private Direction direction;
    private List<Piece> pieces = new ArrayList<Piece>();
    private boolean dontDelete = false;

    public Worm(int x, int y, Direction direction) {
        this.x = x;
        this.y = y;
        this.direction = direction;
        this.pieces.add(new Piece(x, y));
    }

    public Direction getDirection() {
        return direction;
    }

    public void setDirection(Direction direction) {
        this.direction = direction;
    }

    public int getLength() {
        return pieces.size();
    }

    public List<Piece> getPieces() {
        return pieces;
    }

    public void move() {
        switch (this.direction) {
            case UP:
                this.pieces.add(new Piece(x, y - 1));
                break;
            case RIGHT:
                this.pieces.add(new Piece(x + 1, y));
                break;
            case DOWN:
                this.pieces.add(new Piece(x, y + 1));
                break;
            case LEFT:
                this.pieces.add(new Piece(x - 1, y));
                break;
            default:
                break;
        }
        this.updateXY();
        int wormLength = this.getLength();
        if (this.dontDelete || wormLength <= 3) {
            this.dontDelete = false;
        } else {
            this.pieces.remove(0);
        }
    }

    public void grow() {
        this.dontDelete = true;
    }

    public boolean runsInto(Piece piece) {
        for (Piece wormPiece : this.pieces) {
            if (wormPiece.getX() == piece.getX() && wormPiece.getY() == piece.getY()) {
                return true;
            }
        }
        return false;
    }

    public boolean runsIntoItself() {
        for (Piece piece : this.pieces) {
            for (Piece piece2 : this.pieces) {
                if (piece != piece2 && piece.runsInto(piece2)) {
                    return true;
                }
            }
        }
        return false;
    }

    private void updateXY() {
        this.x = this.pieces.get(this.pieces.size() - 1).getX();
        this.y = this.pieces.get(this.pieces.size() - 1).getY();
    }
}
