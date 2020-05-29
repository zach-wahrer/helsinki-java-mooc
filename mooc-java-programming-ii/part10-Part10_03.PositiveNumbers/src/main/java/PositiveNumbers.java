
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.ArrayList;

public class PositiveNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // test your method here
        List<Integer> numbers = new ArrayList<>();
        numbers.add(10);
        numbers.add(-10);
        numbers.add(15);
        numbers.add(0);
        numbers.add(8);
        
        System.out.println(positive(numbers));

    }
    
    public static List<Integer> positive(List<Integer> numbers) {
        return numbers.stream()
            .filter(number -> number > 0)
            .collect(Collectors.toList());
    }

}
