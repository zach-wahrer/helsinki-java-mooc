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
import java.util.ArrayList;

public class Flights {
    private ArrayList<Flight> flights;
    private Planes planes;
    
    public Flights() {
        this.flights = new ArrayList<>();
        this.planes = new Planes();
    }
    
    public void addPlane(String ID, int capacity) {
        this.planes.addPlane(ID, capacity);
    }
    
    public void addFlight(String airplaneID, String departureLocation, String targetLocation) {
        Plane plane = this.planes.getPlane(airplaneID);
        Flight flight = new Flight(plane, departureLocation, targetLocation);
        this.flights.add(flight);
    }
    
    public void printPlanes() {
        System.out.println(this.planes);
    }
    
    @Override 
    public String toString() {
        StringBuilder string = new StringBuilder();
        for (Flight flight : this.flights) {
            string.append(flight.toString() + "\n");
        }
        return string.toString();
    }
}
