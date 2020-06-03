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
    
    public Flights() {
        this.flights = new ArrayList<>();
    }
    
    public void addFlight(Plane plane, String departureLocation, String targetLocation) {
        this.flights.add(new Flight(plane, departureLocation, targetLocation));
    }
    
    @Override 
    public String toString() {
        StringBuilder string = new StringBuilder();
        for (Flight flight : this.flights) {
            string.append(flight.toString());
            string.append("\n");
        }
        return string.toString();
    }
}
