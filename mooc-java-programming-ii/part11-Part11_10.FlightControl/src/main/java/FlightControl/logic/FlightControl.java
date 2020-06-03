/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package FlightControl.logic;

/**
 *
 * @author zachtheclimber
 */
import FlightControl.domain.Flights;
import FlightControl.domain.Planes;

public class FlightControl {
    private Planes planes;
    private Flights flights;
    
    public FlightControl() {
        this.planes = new Planes();
        this.flights = new Flights();
    }
    
    public void addAirplane(String ID, int capacity) {
        this.planes.addPlane(ID, capacity);
    }
    
    public void addFlight(String ID, String departureLocation, String targetLocation) {
        this.flights.addFlight(this.planes.getPlane(ID), departureLocation, targetLocation);
    }
    
    public void printPlanes() {
        System.out.println(this.planes);
    }
    
    public void printFlights() {
        System.out.println(this.flights);
    }
    
    public void printPlane(String ID) {
        this.planes.printPlane(ID);
    }
    
}
