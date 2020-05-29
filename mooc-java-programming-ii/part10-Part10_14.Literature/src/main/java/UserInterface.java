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
    private Library library;
    
    public UserInterface(Scanner scanner, Library library) {
        this.scanner = scanner;
        this.library = library;
    }
    
    public void getBooksFromUser() {
        while (true) {
            System.out.print("Input the name of the book, empty stops: ");
            String name = scanner.nextLine();
            
            if (name.equals("")) {
                break;
            }
            
            System.out.print("Input the age recommendation: ");
            int minimumAge = Integer.valueOf(scanner.nextLine());
            
            library.addBook(name, minimumAge);
        }
    }
}
