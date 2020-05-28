import java.util.Map;
import java.util.HashMap;

public class MainProgram {

    public static void main(String[] args) {
        // test your method here
        Map<Integer, Boolean> truth = new HashMap<>(); 
        truth.put(1, false);
        truth.put(2, true);
        System.out.println(returnSize(truth));
    }

    // Implement here a method returnSize, which takes a Map-object as a parameter 
    // and returns the size of the map object
    public static int returnSize(Map map) {
        return map.size();
    }
}
