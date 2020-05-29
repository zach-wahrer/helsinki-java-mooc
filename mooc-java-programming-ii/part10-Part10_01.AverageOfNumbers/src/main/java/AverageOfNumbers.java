
import java.util.ArrayList;
import java.util.Scanner;

public class AverageOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Write your program here
        UserInterface ui = new UserInterface(scanner);
        ArrayList<Integer> numbers = ui.getNumbers();
        System.out.println("average of the numbers: " + getAverage(numbers));

    }
    
    public static double getAverage(ArrayList<Integer> numbers) {
        return numbers.stream().mapToInt(s -> s).average().getAsDouble();  
    }
}
