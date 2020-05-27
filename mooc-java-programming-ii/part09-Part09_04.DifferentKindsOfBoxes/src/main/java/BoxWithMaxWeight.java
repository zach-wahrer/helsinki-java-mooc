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

public class BoxWithMaxWeight extends Box {
    private int maxWeight;
    private ArrayList<Item> contents;
    
    public BoxWithMaxWeight(int capacity) {
        this.maxWeight = capacity;
        this.contents = new ArrayList<>();
    }
    
    public int getCurrentWeight() {
        int currentWeight = 0;
        for (Item item : this.contents) {
            currentWeight += item.getWeight();
        }
        return currentWeight;
    }
    
    @Override
    public void add(Item item) {
        if (item.getWeight() + this.getCurrentWeight() <= this.maxWeight) {
            this.contents.add(item);
        }
    }
    
    @Override
    public boolean isInBox(Item item) {
        return this.contents.contains(item);
    }
}
