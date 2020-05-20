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

public class Package {
    private ArrayList<Gift> contents;
    
    public Package() {
        this.contents = new ArrayList<>();
    }
    
    public void addGift(Gift gift) {
        this.contents.add(gift);
    }
    
    public int totalWeight() {
        int total = 0;
        for (Gift item: this.contents) {
            total += item.getWeight();
        }
        return total;
    }
}
