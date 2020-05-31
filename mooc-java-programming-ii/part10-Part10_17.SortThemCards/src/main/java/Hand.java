/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author zachtheclimber
 */
import java.util.ArrayList;
import java.util.Collections;

public class Hand implements Comparable<Hand> {
    private ArrayList<Card> cards;
    
    public Hand() {
        this.cards = new ArrayList<>();
    }
    
    public void add(Card card) {
        this.cards.add(card);
    }
    
    public void print() {
        for (Card card : this.cards) {
            System.out.println(card);
        }
    }
    
    public void sort() {
        Collections.sort(this.cards);
    }
    
    public void sortBySuit() {
        Collections.sort(cards, new BySuitInValueOrder());
    }
    
    @Override
    public int compareTo(Hand otherHand) {
        int handValue = 0;
        int otherHandValue = 0;
        
        for (Card card : this.cards) {
            handValue += card.getValue();
        }
        
        for (Card card : otherHand.cards) {
            otherHandValue += card.getValue();
        }
        
        return handValue - otherHandValue;
    }
}
