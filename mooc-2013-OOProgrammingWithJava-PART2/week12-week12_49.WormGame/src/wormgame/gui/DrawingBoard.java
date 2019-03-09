/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package wormgame.gui;

import java.awt.Color;
import java.awt.Graphics;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JPanel;
import wormgame.domain.Apple;
import wormgame.domain.Piece;
import wormgame.game.WormGame;

/**
 *
 * @author josia
 */
public class DrawingBoard extends JPanel implements Updatable {

    private WormGame wormGame;
    private int pieceLength;

    public DrawingBoard(WormGame wormGame, int pieceLength) {
        this.wormGame = wormGame;
        this.pieceLength = pieceLength;
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        List<Piece> pieces = wormGame.getWorm().getPieces();
        g.setColor(Color.BLACK);
        for (Piece piece : pieces) {
            g.fill3DRect(piece.getX() * this.pieceLength, piece.getY() * this.pieceLength, pieceLength, pieceLength, true);
        }
        Apple apple = wormGame.getApple();
        g.setColor(Color.red);
        g.fillOval(apple.getX() * this.pieceLength, apple.getY() * this.pieceLength, pieceLength, pieceLength);
    }

    @Override
    public void update() {
        super.repaint();
    }

}
