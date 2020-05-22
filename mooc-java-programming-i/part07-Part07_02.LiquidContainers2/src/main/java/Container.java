/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author zachtheclimber
 */
public class Container {
    private int contains;
    private int capacity;
    
    public Container() {
        this.contains = 0;
        this.capacity = 100;
    }
    
    public int contains() {
        return this.contains;
    }
    
    public void add(int amount) {
        if (amount < 0) {
            return;
        }
        
        if (amount + this.contains > this.capacity) {
            this.contains = this.capacity;
        } else {
            this.contains += amount;
        }
    }
    
    public void move(int amount, Container other) {
        if (amount < 0) {
            return;
        }
        
        if (amount > this.contains) {
            amount = this.contains;
        }
        
        if (amount > 0) {
            this.remove(amount);
            other.add(amount);
        }
    }
    
    public void remove(int amount) {
        if (amount < 0) {
            return;
        }
        
        if (this.contains - amount < 0) {
            this.contains = 0;
        } else {
            this.contains -= amount;
        }
    }
    
    @Override
    public String toString() {
        return this.contains + "/" + this.capacity;
    }
}
