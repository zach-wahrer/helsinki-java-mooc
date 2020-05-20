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

public class Suitcase {
    // Used a currentWeight variable here, but then the exercise said not to...
    private int maxWeight;
    private ArrayList<Item> contents;
    
    public Suitcase(int maxWeight) {
        this.maxWeight = maxWeight;
        this.contents = new ArrayList<>();
    }
    
    public void addItem(Item item) {
        int currentWeight = this.totalWeight();
        if (currentWeight + item.getWeight() <= maxWeight) {
            this.contents.add(item);
        }
    }
    
    public void printItems() {
        for (Item item : this.contents) {
            System.out.println(item);
        }
        
    }
    
    public int totalWeight() {
        int currentWeight = 0;
        for (Item item : this.contents) {
            currentWeight += item.getWeight();
        }
        return currentWeight;
    }
    
    public Item heaviestItem() {
        if (this.contents.isEmpty()) {
            return null;
        }
        
        Item heaviest = this.contents.get(0);
        for (Item item : this.contents) {
            if (item.getWeight() > heaviest.getWeight()) {
                heaviest = item;
            }
        }
        return heaviest;
    }
    
    @Override
    public String toString() {
        if (this.contents.isEmpty()) {
            return "no items (0 kg)";
        } else if (this.contents.size() == 1) {
            return "1 item (" + this.totalWeight() + " kg)";
        } else {
            return this.contents.size() + " items (" + this.totalWeight() + " kg)";
        }
    }
}
