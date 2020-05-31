/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author zachtheclimber
 */
import java.util.Comparator;

public class BySuitInValueOrder implements Comparator<Card> {
    
    @Override
    public int compare(Card c1, Card c2) {
        int compare;
        compare = c1.getSuit().ordinal() - c2.getSuit().ordinal();
        if (compare == 0) {
            compare = c1.getValue() - c2.getValue();
        }
        return compare;
        
    }
}
