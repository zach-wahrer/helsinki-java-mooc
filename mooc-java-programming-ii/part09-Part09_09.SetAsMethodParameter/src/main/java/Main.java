import java.util.Set;
import java.util.HashSet;

public class Main {

    public static void main(String[] args) {
        // You can test your method here
        HashSet<Integer> set = new HashSet<>();
        set.add(1);
        set.add(1);
        set.add(10);
        set.add(30);
        System.out.println(returnSize(set));
    }

    // implement the method returnSize here, which returns
    // the number of elements in the set that it receives as a parameter.
    public static int returnSize(Set set) {
        return set.size();
    }
}
