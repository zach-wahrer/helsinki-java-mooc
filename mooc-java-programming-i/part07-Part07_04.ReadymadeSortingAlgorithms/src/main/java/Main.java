import java.util.Arrays;
import java.util.ArrayList;
import java.util.Collections;

public class Main {

    public static void main(String[] args) {
        // insert test code here
        int[] intArray = {3, 1, 5, 99, 3, 12};
        sort(intArray);
        System.out.println(Arrays.toString(intArray));
        
        String[] stringArray = {"b", "d", "z", "a", "x"};
        sort(stringArray);
        System.out.println(Arrays.toString(stringArray));
        
        ArrayList<Integer> intList = new ArrayList<>();
        intList.add(6);
        intList.add(1);
        intList.add(99);
        intList.add(-1);
        sortIntegers(intList);
        System.out.println(intList);
        
        ArrayList<String> stringList = new ArrayList<>();
        stringList.add("x");
        stringList.add("q");
        stringList.add("A");
        stringList.add("Z");
        stringList.add("p");
        stringList.add("z");
        sortStrings(stringList);
        System.out.println(stringList);
    }
    
    public static void sort(int[] array) {
        Arrays.sort(array);
    }
    
    public static void sort(String[] array) {
        Arrays.sort(array);
    }
    
    public static void sortIntegers(ArrayList<Integer> integers) {
        Collections.sort(integers);
    }
    
    public static void sortStrings(ArrayList<String> strings) {
        Collections.sort(strings);
    }

}
