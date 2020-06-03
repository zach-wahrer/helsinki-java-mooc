/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package FlightControl.domain;

/**
 *
 * @author zachtheclimber
 */
import java.util.HashMap;
import java.util.ArrayList;

public class Planes {
    private HashMap<String, Plane> planes;
    
    public Planes() {
        this.planes = new HashMap<>();
    }
    
    public void addPlane(String ID, int capacity) {
        this.planes.put(ID, new Plane(ID, capacity));
    }
    
    public Plane getPlane(String ID) {
        return this.planes.get(ID);
    }
    
    public void printPlane(String ID) {
        System.out.println(this.planes.get(ID));
    }
    
    public ArrayList<Plane> getPlaneList() {
        ArrayList<Plane> planeList = new ArrayList<>();
        for (Plane plane : this.planes.values()) {
            planeList.add(plane);
        }
        return planeList;
    }
    
    @Override
    public String toString() {
        StringBuilder string = new StringBuilder();
        for (Plane plane : this.planes.values()) {
            string.append(plane.toString());
            string.append("\n");
        }
        return string.toString();
    }
}
