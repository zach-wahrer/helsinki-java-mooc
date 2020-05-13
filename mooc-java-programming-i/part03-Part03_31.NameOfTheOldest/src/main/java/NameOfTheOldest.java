
import java.util.Scanner;

public class NameOfTheOldest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String nameOfOldest = "";
        int ageOfOldest = -1;
        
        while (true) {
            String input = scanner.nextLine();
            
            if (input.equals("")) {
                break;
            }
            
            String[] person = input.split(",");
            if (Integer.valueOf(person[1]) > ageOfOldest) {
                nameOfOldest = person[0];
                ageOfOldest = Integer.valueOf(person[1]);
            }
        }
        
        System.out.println("Name of the oldest: " + nameOfOldest);

    }
}
