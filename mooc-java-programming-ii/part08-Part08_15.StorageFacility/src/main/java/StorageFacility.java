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
import java.util.ArrayList;

public class StorageFacility {
    private HashMap<String, ArrayList<String>> contents;
    
    public StorageFacility() {
        this.contents = new HashMap<>();
    }
    
    public void add(String unit, String item) {
        this.contents.putIfAbsent(unit, new ArrayList<>());
        this.contents.get(unit).add(item);
    }
    
    public ArrayList<String> contents(String storageUnit) {
        return this.contents.getOrDefault(storageUnit, new ArrayList<>());
    }
    
    public void remove(String storageUnit, String item) {
        this.contents.get(storageUnit).remove(this.contents.get(storageUnit).indexOf(item));
        if (this.contents.get(storageUnit).isEmpty()) {
            this.contents.remove(storageUnit);
        }
    }
    
    public ArrayList<String> storageUnits() {
        ArrayList<String> units = new ArrayList<>();
        for (String unit : this.contents.keySet()) {
            if (this.contents.get(unit).size() > 0) {
                units.add(unit);
            }
        }
        return units;
    }
}
