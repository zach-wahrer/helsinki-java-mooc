
import java.util.ArrayList;
import java.util.Scanner;

public class PersonalDetails {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String longestName = "";
        int numberOfPeople = 0;
        int sumOfYears = 0;
        
        while (true) {
            String input = scanner.nextLine();
            
            if (input.equals("")) {
                break;
            }
            
            String[] person = input.split(",");
            if (person[0].length() > longestName.length()) {
                longestName = person[0];
            }
            
            sumOfYears += Integer.valueOf(person[1]);
            numberOfPeople++;
        }
        
        System.out.println("Longest name: " + longestName);
        System.out.println("Average of the birth years: " + 1.0 * sumOfYears / numberOfPeople);

    }
}
