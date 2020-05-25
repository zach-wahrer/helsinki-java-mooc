
import java.util.Scanner;

public class LiquidContainers {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int container1 = 0;
        int container2 = 0;

        while (true) {
            System.out.println("First: " + container1 + "/100");
            System.out.println("Second: " + container2 + "/100");
            System.out.print("> ");
            String input = scan.nextLine();
            String[] commandParts = input.split(" ");
            
            if (commandParts[0].equals("quit")) {
                break;
            } else if (commandParts[0].equals("add")) {
                int toAdd = Integer.valueOf(commandParts[1]);
                if (container1 + toAdd > 100 && toAdd > 0) {
                    container1 = 100;
                } else if (toAdd > 0) {
                    container1 += toAdd;
                }
            } else if (commandParts[0].equals("move")) {
                int toMove = Integer.valueOf(commandParts[1]);
                if (toMove > container1) {
                    toMove = container1;
                    container1 = 0;
                } else {
                    container1 -= toMove;
                }
                if (toMove + container2 > 100) {
                    container2 = 100;
                } else {
                    container2 += toMove;
                }
            } else if (commandParts[0].equals("remove")) {
                int toRemove = Integer.valueOf(commandParts[1]);
                if (toRemove > container2) {
                    toRemove = container2;
                }
                container2 -= toRemove;
            }
        }
    }

}
