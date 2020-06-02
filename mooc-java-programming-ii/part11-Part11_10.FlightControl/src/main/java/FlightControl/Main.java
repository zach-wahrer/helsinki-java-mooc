package FlightControl;

import FlightControl.domain.*;

public class Main {

    public static void main(String[] args) {
        // Write the main program here. It is useful to create some classes of your own.
        Flights flights = new Flights();
        flights.addPlane("N1121", 10);
        flights.addPlane("N17204", 2);
        flights.addFlight("N1121", "BZN", "DIA");
        flights.addFlight("N17204", "DIA", "BZN");
        
        System.out.println(flights);
        flights.printPlanes();
        
    }
}
