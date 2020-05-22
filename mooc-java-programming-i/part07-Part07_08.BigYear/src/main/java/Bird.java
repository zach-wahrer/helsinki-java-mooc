/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author zachtheclimber
 */
public class Bird {
    private String englishName;
    private String latinName;
    private int timesObserved;
    
    public Bird(String englishName, String latinName) {
        this.englishName = englishName;
        this.latinName = latinName;
        this.timesObserved = 0;
    }


    public String getEnglishName() {
        return englishName;
    }

    public void observed() {
        this.timesObserved++;
    }
    
    public int getTimesObserved() {
        return this.timesObserved;
    }
    
    @Override
    public String toString() {
        return this.englishName + " (" + this.latinName + "): " + this.timesObserved + " observations";
    }
    
}
