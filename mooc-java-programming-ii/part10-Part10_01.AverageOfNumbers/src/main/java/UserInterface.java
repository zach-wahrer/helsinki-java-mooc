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
import java.util.ArrayList;

public class UserInterface {
    private Scanner scanner;
    
    public UserInterface(Scanner scanner) {
        this.scanner = scanner;
    }
    
    public ArrayList<Integer> getNumbers() {
        ArrayList<Integer> numbers = new ArrayList<>();
        System.out.println("Input numbers, type \"end\" to stop");
        
        while (true) {
            String input = this.scanner.nextLine();
            if (input.equals("end")) {
                break;
            }
            
            numbers.add(Integer.valueOf(input));
        }
        
        return numbers;
    }
}
