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

public class Abbreviations {
    HashMap<String, String> translation;
    
    public Abbreviations() {
        this.translation = new HashMap<>();
    }
    
    public void addAbbreviation(String abbreviation, String translation) {
        if (!(this.hasAbbreviation(abbreviation))) {
            this.translation.put(abbreviation, translation);
        }
    }
    
    public boolean hasAbbreviation(String abbreviation) {
        return this.translation.containsKey(abbreviation);
    }
    
    public String findExplanationFor(String abbreviation) {
        return this.translation.get(abbreviation);
    }
}
