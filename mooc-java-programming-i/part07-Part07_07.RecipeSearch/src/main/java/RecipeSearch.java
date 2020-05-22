
import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

public class RecipeSearch {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        RecipeIndex rI = new RecipeIndex();
        UserInterface uI = new UserInterface(scanner, rI);
        
        uI.start();
        
    }

}
