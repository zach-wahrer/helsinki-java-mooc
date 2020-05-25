
import java.util.Scanner;
import java.util.ArrayList;

public class AverageOfPositiveNumbers {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> numbers = new ArrayList<>();
        
        while (true) {
            int number = Integer.valueOf(scanner.nextLine());
            
            if (number == 0) {
                break;
            }
            
            if (number > 0) {
                numbers.add(number);
            }
            
            
        }
        
        if (numbers.isEmpty()) {
            System.out.println("Cannot caluclate average");
        } else {
            printAverage(numbers);
        }
        
    }
    
    public static void printAverage(ArrayList<Integer> numbers) {
        double average = 0;
        for (int number : numbers) {
            average += number;
        }
        System.out.println(average / numbers.size());
        
    }
}
