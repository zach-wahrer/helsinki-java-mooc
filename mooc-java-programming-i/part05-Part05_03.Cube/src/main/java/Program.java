
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Experiment with your program here
        
        Cube myCube = new Cube(4);
        System.out.println("Volume is: " + myCube.volume());
        System.out.println(myCube);
    }
}
