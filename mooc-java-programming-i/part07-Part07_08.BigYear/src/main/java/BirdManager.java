/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author zachtheclimber
 */
import java.util.HashMap;

public class BirdManager {
    private HashMap<String, Bird> birds;
    
    public BirdManager() {
        this.birds = new HashMap<>();
    }
    
    public void add(Bird bird) {
        this.birds.put(bird.getEnglishName(), bird);
    }
    
    public void observation(String bird) {
        this.birds.get(bird).observed();
    }
    
    public boolean birdIsOnList(String bird) {
        return this.birds.get(bird) != null;
    }
    
    public void printAll() {
        for (Bird bird : this.birds.values()) {
            System.out.println(bird);
        }
    }
    
    public void printOne(String bird) {
        System.out.println(this.birds.get(bird));
    }
    
    
}
