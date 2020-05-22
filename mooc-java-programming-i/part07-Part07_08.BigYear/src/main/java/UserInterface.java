/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author zachtheclimber
 */
import java.util.Scanner;

public class UserInterface {
    private Scanner scanner;
    private BirdManager birdManager;
    
    public UserInterface(Scanner scanner, BirdManager birdManager) {
        this.scanner = scanner;
        this.birdManager = birdManager;
    }
    
    public void start() {
        boolean keepRunning = true;
        
        while (keepRunning == true) {
            String command = getCommand();
            keepRunning = runCommand(command);
        }
    }
    
    public String getCommand() {
        System.out.print("? ");
        return this.scanner.nextLine();
    }
    
    public boolean runCommand(String command) {
        if (command.equals("Quit")) {
            return false;
        }
        
        if (command.equals("Add")) {
            System.out.print("Name: ");
            String englishName = this.scanner.nextLine();
            System.out.print("Name in Latin: ");
            String latinName = this.scanner.nextLine();
            this.birdManager.add(new Bird(englishName, latinName));
        
        } else if (command.equals("Observation")) {
            System.out.print("Bird? ");
            String englishName = this.scanner.nextLine();
            if (this.birdManager.birdIsOnList(englishName)) {
                this.birdManager.observation(englishName);
            } else {
                System.out.println("Not a bird!");
            }
            
        } else if (command.equals("All")) {
            this.birdManager.printAll();
        }
        
        else if (command.equals("One")) {
            System.out.print("Bird? ");
            this.birdManager.printOne(this.scanner.nextLine());
        }
        
        return true;
    }
}
