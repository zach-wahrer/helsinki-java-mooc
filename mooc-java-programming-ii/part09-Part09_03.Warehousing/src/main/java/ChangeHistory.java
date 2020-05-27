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

public class ChangeHistory {
    private ArrayList<Double> history;
    
    public ChangeHistory() {
        this.history = new ArrayList<>();
    }
    
    public void add(double status) {
        this.history.add(status);
    }
    
    public void clear() {
        this.history.clear();
    }
    
    @Override
    public String toString() {
        return this.history.toString();
    }
    
    public double maxValue() {       
        
        double maxValueInList = 0.0;
        for (double value : this.history) {
            if (value > maxValueInList) {
                maxValueInList = value;
            }
        }
        
        return maxValueInList;
    }
    
    public double minValue() {       
        if (this.history.isEmpty()) {
            return 0.0;
        }
        
        double minValueInList = this.history.get(0);
        for (double value : this.history) {
            if (value < minValueInList) {
                minValueInList = value;
            }
        }
       
        return minValueInList;
    }
    
    public double average() {
        if (this.history.isEmpty()) {
            return 0.0;
        }
        
        double averageValue = 0;
        for (double value : this.history) {
            averageValue += value;
        }
        
        return averageValue / this.history.size();
    }
    
    
}
