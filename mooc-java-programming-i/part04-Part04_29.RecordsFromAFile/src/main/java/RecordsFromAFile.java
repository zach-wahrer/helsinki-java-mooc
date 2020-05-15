
import java.nio.file.Paths;
import java.util.Scanner;
import java.util.ArrayList;

public class RecordsFromAFile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Name of the file: ");
        String fileName = scanner.nextLine();
        
        ArrayList<Person> people = csvToPeople(fileName);
        printPeopleFromArrayList(people);
    }
    
    public static ArrayList<Person> csvToPeople(String fileName) {
        ArrayList<Person> people = new ArrayList<>();
        
        try (Scanner fileScanner = new Scanner(Paths.get(fileName))) {
            while (fileScanner.hasNextLine()) {
                String[] line = fileScanner.nextLine().split(",");
                String name = line[0];
                int age = Integer.valueOf(line[1]);
                people.add(new Person(name, age));
            }
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
        
        return people;
    } 
    
    public static void printPeopleFromArrayList(ArrayList<Person> people) {
        for (Person person: people) {
            System.out.println(person);
        }
    }
}
