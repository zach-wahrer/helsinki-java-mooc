
import java.util.Scanner;

public class AverageOfPositiveNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numOfPositives = 0;
        int sum = 0;
        
        while (true) {
            int number = Integer.valueOf(scanner.nextLine());
            
            if (number == 0) {
                break;
            }
            
            if (number > 0) {
                numOfPositives += 1;
                sum += number;
            }
        }
        
        if (numOfPositives > 0) {
            System.out.println(sum / (numOfPositives * 1.0));
        } else {
            System.out.println("Cannot calculate the average");
        }
        
    }
}
