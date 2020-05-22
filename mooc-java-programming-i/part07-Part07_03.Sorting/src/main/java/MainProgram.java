
import java.util.Arrays;
public class MainProgram {

    public static void main(String[] args) {
        // write your test code here
        int[] array = {3, 1, 5, 99, 3, 12};
        System.out.println(Arrays.toString(array));
        sort(array);
    }
    
    public static void sort(int[] array) {
        for (int i = 0; i < array.length; i++) {
            int smallestIndex = indexOfSmallestFrom(array, i);
            swap(array, i, smallestIndex);
            System.out.println(Arrays.toString(array));
        }
    }
    
    public static int smallest(int[] array) {
        int smallest = array[0];
        for (int number : array) {
            if (number < smallest) {
                smallest = number;
            }
        }
        return smallest;
    }
    
    public static int indexOfSmallest(int[] array) {
        int smallest = array[0];
        int smallestIndex = 0;
        
        for (int i = 0; i < array.length; i++) {
            if (array[i] < smallest) {
                smallest = array[i];
                smallestIndex = i;
            }
        }
        
        return smallestIndex;
    }
    
    public static int indexOfSmallestFrom(int[] array, int startIndex) {
        int smallest = array[startIndex];
        int smallestIndex = startIndex;
        
        while (startIndex < array.length) {
            if (array[startIndex] < smallest) {
                smallest = array[startIndex];
                smallestIndex = startIndex;
            }
            startIndex++;
        }
        return smallestIndex;
    }
    
    public static void swap(int[] array, int index1, int index2) {
        int temp = array[index2];
        array[index2] = array[index1];
        array[index1] = temp;
 
    }

}
