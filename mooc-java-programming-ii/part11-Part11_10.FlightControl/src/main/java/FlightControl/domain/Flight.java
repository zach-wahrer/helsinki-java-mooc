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
public class Flight {
    private Plane plane;
    private String departureLocation;
    private String targetLocation;
    
    public Flight(Plane plane, String depart, String target) {
        this.plane = plane;
        this.departureLocation = depart;
        this.targetLocation = target;
    }
    
    @Override
    public String toString() {
        return this.plane.toString() + " (" + this.departureLocation + "-" + this.targetLocation + ")";
    }
}
