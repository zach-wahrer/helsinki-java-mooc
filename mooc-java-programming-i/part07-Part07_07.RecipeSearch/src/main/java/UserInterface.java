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
    private RecipeIndex rI;
    
    public UserInterface(Scanner scanner, RecipeIndex rI) {
        this.scanner = scanner;
        this.rI = rI;
    }
    
    public void start() {
        System.out.print("File to read: ");
        rI.importRecipesFromFile(scanner.nextLine());
        
        printCommands();
        
        boolean keepRunning = true; 
        while (keepRunning) {
            String command = this.getInput();
            keepRunning = this.executeCommand(command);
        }
    }
    
    public void printCommands() {
        System.out.println("\nCommands:");
        System.out.println("list - lists the recipes");
        System.out.println("stop - stops the program");
        System.out.println("find name - searches recipes by name");
        System.out.println("find cooking time - searches recipes by cooking time");
        System.out.println("find ingredient - searches recipes by ingredient");
    }
    
    public String getInput() {
        System.out.print("Enter command: ");
        return this.scanner.nextLine();
    }
    
    public boolean executeCommand(String command) {
        if (command.equals("stop")) {
            return false;
        }
        
        if (command.equals("list")) {
            System.out.print("\n" + rI + "\n");
        
        } else if (command.equals("find name")) {
            System.out.print("Sarched word: ");
            String name = scanner.nextLine();
            System.out.println("");
            System.out.println(rI.toString(rI.searchByName(name)));
            
        } else if (command.equals("find cooking time")) {
            System.out.print("Max cooking time: ");
            int time = Integer.valueOf(scanner.nextLine());
            System.out.println("");
            System.out.println(rI.toString(rI.searchByTime(time)));
        
        } else if (command.equals("find ingredient")) {
            System.out.print("Ingredient: ");
            String ingredient = scanner.nextLine();
            System.out.println("");
            System.out.println(rI.toString(rI.searchByIngredient(ingredient)));
        }
        
        return true;
    }
}
