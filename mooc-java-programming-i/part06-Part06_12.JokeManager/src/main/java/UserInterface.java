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
    private JokeManager jokes;
    private Scanner scanner;

    public UserInterface(JokeManager jokes, Scanner scanner) {
        this.jokes = jokes;
        this.scanner = scanner;
    }
    
    public void start() {
        boolean keepRunning = true;
        while (keepRunning) {
            printCommands();
            String command = getInput();
            keepRunning = executeCommand(command);
        }
    }
    
    public boolean executeCommand(String command) {
        if (command.equals("X")) {
            return false;
        } else if (command.equals("1")) {
            System.out.println("Write the joke to be added:");
            this.jokes.addJoke(getInput());
        } else if (command.equals("2")) {
            System.out.println(this.jokes.drawJoke());
        } else if (command.equals("3")) {
            this.jokes.printJokes();
        }
        return true;
    }
    
    public String getInput() {
        return this.scanner.nextLine();
    }
    
    public void printCommands() {
        System.out.println("Commands: ");
        System.out.println("1 - add joke");
        System.out.println("2 - draw a joke");
        System.out.println("3 - list jokes");
        System.out.println("X - stop");
    }
}
