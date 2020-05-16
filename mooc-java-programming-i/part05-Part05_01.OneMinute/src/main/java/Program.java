
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {
        // You can test your program here

    Timer timer = new Timer();
    
    for (int i = 0; i < 120; i++) {
        timer.advance();
        System.out.println(timer);
    }

    }
}
