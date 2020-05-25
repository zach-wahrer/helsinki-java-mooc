
import java.util.Scanner;

public class LiquidContainers2 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Container container1 = new Container();
        Container container2 = new Container();

        while (true) {
            System.out.println("First: " + container1);
            System.out.println("Second: " + container2);
            System.out.print("> ");
            String input = scan.nextLine();
            String[] commandParts = input.split(" ");
            
            if (commandParts[0].equals("quit")) {
                break;
            } else if (commandParts[0].equals("add")) {
                int toAdd = Integer.valueOf(commandParts[1]);
                container1.add(toAdd);
            } else if (commandParts[0].equals("move")) {
                int toMove = Integer.valueOf(commandParts[1]);
                container1.move(toMove, container2);
            } else if (commandParts[0].equals("remove")) {
                int toRemove = Integer.valueOf(commandParts[1]);
                container2.remove(toRemove);
            }
        }
    }

}
