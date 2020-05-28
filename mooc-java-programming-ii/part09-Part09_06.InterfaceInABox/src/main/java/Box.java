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

public class Box implements Packable {
    private double capacity;
    private ArrayList<Packable> contents;
    
    public Box(double maxCapacity) {
        this.capacity = maxCapacity;
        this.contents = new ArrayList<>();
    }
    
    @Override
    public double weight() {
        double weight = 0;
        for (Packable item : this.contents) {
            weight += item.weight();
        }
        return weight;
    }
    
    public void add(Packable item) {
        if (this.weight() + item.weight() <= this.capacity) {
            this.contents.add(item);
        }
    }
    
    
    @Override
    public String toString() {
        return "Box: " + this.contents.size() + " items, total weight " + this.weight() + " kg";
    }
}