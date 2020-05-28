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

public class Herd implements Movable {
    private ArrayList<Movable> herd;
    
    public Herd() {
        this.herd = new ArrayList<>();
    }
    
    public void move(int dx, int dy) {
        for (Movable organism : this.herd) {
            organism.move(dx, dy);
        }
    }
    
    public void addToHerd(Movable organism) {
        this.herd.add(organism);
    }
    
    @Override
    public String toString() {
        String string = "";
        for (Movable organism : this.herd) {
            string += organism.toString() + "\n";
        }
        return string;
    }
    
}
