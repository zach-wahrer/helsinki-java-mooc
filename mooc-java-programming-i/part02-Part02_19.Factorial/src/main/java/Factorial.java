
import java.util.Scanner;

public class Factorial {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Give a number:");
        int factorialOf = Integer.valueOf(scanner.nextLine());
        int factorialSum = 1;
        
        for (int i = 1; i <= factorialOf; i++) {
            factorialSum *= i;
        }
        
        System.out.println("Factorial: " + factorialSum);
    }
}
