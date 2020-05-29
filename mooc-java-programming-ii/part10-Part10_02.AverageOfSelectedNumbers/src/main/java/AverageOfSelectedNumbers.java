
import java.util.ArrayList;
import java.util.Scanner;

public class AverageOfSelectedNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // toteuta ohjelmasi tänne
        ArrayList<Integer> numbers = getNumbers(scanner);
        String type = getAverageType(scanner);
        double average = getAverage(type, numbers);
        print(average);
    }
    
    public static String getAverageType(Scanner scanner) {
        System.out.println("Print the average of the negative numbers or the positive numbers? (n/p)");
        return scanner.nextLine();
    }
    
    public static ArrayList<Integer> getNumbers(Scanner scanner) {
        ArrayList<Integer> numbers = new ArrayList<>();
        System.out.println("Input numbers, type \"end\" to stop.");
        
        while (true) {
            String input = scanner.nextLine();
            if (input.equals("end")) {
                break;
            }
            
            numbers.add(Integer.valueOf(input));
        }
        
        return numbers;
    }
    
    public static double getAverage(String type, ArrayList<Integer> numbers) {
        if (type.equals("n")) {
            return numbers.stream().mapToInt(s -> s).filter(number -> number < 0).average().getAsDouble();
        } else {
            return numbers.stream().mapToInt(s -> s).filter(number -> number > 0).average().getAsDouble();
        }
    }
    
    public static void print(Object value) {
        System.out.println(value);
    }
}
