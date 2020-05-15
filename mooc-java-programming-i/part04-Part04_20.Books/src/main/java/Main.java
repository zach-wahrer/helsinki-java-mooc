import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        
        // implement here the program that allows the user to enter 
        // book information and to examine them
        Scanner scanner = new Scanner(System.in);
        ArrayList<Book> books = new ArrayList<>();
        
        while (true) {
            System.out.print("Name: ");
            String name = scanner.nextLine();
            
            if (name.equals("")) {
                break;
            }
            
            System.out.print("Pages: ");
            int pages = Integer.valueOf(scanner.nextLine());
            System.out.print("Publication year: ");
            int publicationYear = Integer.valueOf(scanner.nextLine());
            
            books.add(new Book(name, pages, publicationYear));
        }
        
        System.out.print("What information will be printed? ");
        String whatToPrint = scanner.nextLine();
        
        for (Book book: books) {
            if (whatToPrint.equals("everything")) {
                System.out.println(book);
            } else {
                System.out.println(book.getTitle());
            }
        }
    }
}
