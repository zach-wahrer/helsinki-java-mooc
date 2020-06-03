/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package FlightControl.ui;

/**
 *
 * @author zachtheclimber
 */
import java.util.Scanner;
import FlightControl.logic.FlightControl;

public class UserInterface {
    private Scanner scanner;
    private FlightControl fc;

    
    public UserInterface(Scanner scanner) {
        this.scanner = scanner;
        this.fc = new FlightControl();
    }
    
    public void start() {
        startAssetControl();
        startFlightControl();
    }
    
    public void startAssetControl() {
        while (true) {
            printAssetControlMenu();
            String command = getInput();
            if (command.equals("x")) {
                break;
            } else if (command.equals("1")) {
                addAirplane();
            } else if (command.equals("2")) {
                addFlight();
            }
        }
    }
    
    public void startFlightControl() {
        while (true) {
            printFlightControlMenu();
            String command = getInput();
            if (command.equals("x")) {
                break;
            } else if (command.equals("1")) {
                printPlanes();
            } else if (command.equals("2")) {
                printFlights();
            } else if (command.equals("3")) {
                printPlaneDetails();
            }
        }
    }
    
    public void printAssetControlMenu() {
        System.out.println("Part1: Airport Asset Control");
        System.out.println("Choose an action:");
        System.out.println("[1] Add an airplane");
        System.out.println("[2] Add a flight");
        System.out.println("[x] Exit Airport Asset Control");
        System.out.print("> ");
    }
    
    public void printFlightControlMenu() {
        System.out.println("Part2: Flight Control");
        System.out.println("Choose an action:");
        System.out.println("[1] Print airplanes");
        System.out.println("[2] Print flights");
        System.out.println("[3] Print airplane details");
        System.out.println("[x] Quit");
        System.out.print("> ");
    }
    
    public String getInput() {
        return this.scanner.nextLine();
    }
    
    public void addAirplane() {
        System.out.print("Give the airplane id: ");
        String ID = getInput();
        System.out.print("Give the airplane capacity: ");
        int capacity = Integer.valueOf(getInput());
        fc.addAirplane(ID, capacity);
    }
    
    public void addFlight() {
        System.out.print("Give the airplane id: ");
        String ID = getInput();
        System.out.print("Give the departure airport id: ");
        String departure = getInput();
        System.out.print("Give the target airport id: ");
        String target = getInput();
        fc.addFlight(ID, departure, target);
    }
    
    public void printPlanes() {
        this.fc.printPlanes();
    }
    
    public void printFlights() {
        this.fc.printFlights();
    }
    
    public void printPlaneDetails() {
        System.out.print("Give the airplane id: ");
        this.fc.printPlane(getInput());
    }
}
