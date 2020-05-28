import java.util.List;
import java.util.ArrayList;

public class mainProgram {

    public static void main(String[] args) {
        // test your method here
        List<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(10);
        numbers.add(19);
        System.out.println(returnSize(numbers));
    }
    
    public static int returnSize(List list) {
        return list.size();
    } 
    // Implement here a method returnSize
    // which returns the size of the list given to it
    //as a parameter
}
