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

public class Stack {
    private ArrayList<String> stackData;
    
    public Stack() {
        this.stackData = new ArrayList<>();
    }
    
    public boolean isEmpty() {
        return stackData.isEmpty();
    }
    
    public void add(String value) {
        this.stackData.add(value);
    }
    
    public ArrayList<String> values() {
        return this.stackData;
    }
    
    public String take() {      
        return this.stackData.remove(this.stackData.size() - 1);
        
    }
}
