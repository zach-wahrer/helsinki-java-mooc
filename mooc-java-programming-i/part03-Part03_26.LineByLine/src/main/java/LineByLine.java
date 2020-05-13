
import java.util.Scanner;

public class LineByLine {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            String input = scanner.nextLine();
            if (input.equals("")) {
                break;
            }
            String[] list = input.split(" ");
            for (String word: list) {
                System.out.println(word);
            }
        }

    }
}
