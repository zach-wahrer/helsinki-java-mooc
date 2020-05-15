
import java.nio.file.Paths;
import java.util.Scanner;
import java.util.ArrayList;

public class NumbersFromAFile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("File? ");
        String file = scanner.nextLine();
        System.out.print("Lower bound? ");
        int lowerBound = Integer.valueOf(scanner.nextLine());
        System.out.print("Upper bound? ");
        int upperBound = Integer.valueOf(scanner.nextLine());
        
        ArrayList<Integer> numbers = readFileToArrayList(file);
        
        System.out.println("Numbers: " + numsWithinBounds(numbers, upperBound, lowerBound));
        
    }
    
    public static ArrayList readFileToArrayList(String fileName) {
        ArrayList<Integer> numbers = new ArrayList<>();
        
        try (Scanner fileScanner = new Scanner(Paths.get(fileName))) {
            while (fileScanner.hasNextLine()) {
                numbers.add(Integer.valueOf(fileScanner.nextLine()));
            }
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
 
        return numbers;
    }
    
    public static int numsWithinBounds(ArrayList<Integer> numbers, int upperBound, int lowerBound) {
        int count = 0;
        for (int number: numbers) {
            if (number >= lowerBound && number <= upperBound) {
                count++;
            }
        }
        return count;
    }

}
