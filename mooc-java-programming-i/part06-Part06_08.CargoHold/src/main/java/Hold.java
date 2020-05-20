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

public class Hold {
    private int maxWeight;
    private ArrayList<Suitcase> contents;
    
    public Hold(int maxWeight) {
        this.maxWeight = maxWeight;
        this.contents = new ArrayList<>();
    }
    
    public void addSuitcase(Suitcase suitcase) {
        if (this.totalWeight() + suitcase.totalWeight() <= this.maxWeight) {
            this.contents.add(suitcase);
        }
    }
    
    public int totalWeight() {
        int currentWeight = 0;
        for (Suitcase suitcase : contents) {
            currentWeight += suitcase.totalWeight();
        }
        return currentWeight;
    }
    
    public void printItems() {
        for (Suitcase suitcase : this.contents) {
            suitcase.printItems();
        }
    }
    
    @Override
    public String toString() {
        return this.contents.size() + " suitcases (" + this.totalWeight() + " kg)";
    }
}
