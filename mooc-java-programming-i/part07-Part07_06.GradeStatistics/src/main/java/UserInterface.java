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
    private Points points;
    
    public UserInterface(Scanner scanner, Points points) {
        this.scanner = scanner;
        this.points = points;
    }
    
    public void start() {
        System.out.println("Enter point totals, -1 stops:");
        
        while (true) {
            int input = Integer.valueOf(this.scanner.nextLine());
            
            if (input == -1) {
                break;
            }
            
            points.add(input);
        }
        
        points.printAverage();
        points.printAverageOfPassing();
        points.printPassPercentage();
        points.printGradeDistribution();
        
        
    } 
}
