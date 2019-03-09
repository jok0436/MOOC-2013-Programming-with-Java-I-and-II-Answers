
import java.util.ArrayList;
import java.util.Collections;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author josia
 */
public class Hand implements Comparable<Hand> {

    private ArrayList<Card> cards = new ArrayList<Card>();

    public void add(Card card) {
        cards.add(card);
    }

    public void print() {
        for (Card card : cards) {
            System.out.println(card);
        }
    }

    public void sort() {
        Collections.sort(cards);
    }

    @Override
    public int compareTo(Hand otherHand) {
        return this.totalValue() - otherHand.totalValue();
    }

    public int totalValue() {
        int output = 0;
        for (Card card : cards) {
            output += card.getValue();
        }
        return output;
    }

    public void sortAgainstSuit() {
        Collections.sort(cards, new SortAgainstSuitAndValue());
    }
}
