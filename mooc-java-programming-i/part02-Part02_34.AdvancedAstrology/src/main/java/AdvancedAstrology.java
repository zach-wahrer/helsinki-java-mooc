
public class AdvancedAstrology {

    public static void printStars(int number) {
        // part 1 of the exercise
        for (int i = 0; i < number; i++) {
            System.out.print("*");
        }
        System.out.println();
    }

    public static void printSpaces(int number) {
        // part 1 of the exercise
        for (int i = 0; i < number; i++) {
            System.out.print(" ");
        }
    }

    public static void printTriangle(int size) {
        // part 2 of the exercise
        for (int i = 1; i <= size; i++) {
            printSpaces(size - i);
            printStars(i);
        }
    }
    
    public static void printBase(int baseHeight, int baseWidth, int treeHeight) {
        int spaces = maxSpaces(treeHeight);
        spaces--;
        for (int i = 0; i < baseHeight; i++) {
            printSpaces(spaces);
            printStars(baseWidth);
        }
    }
    
    public static int maxSpaces(int height) {
        int startSpaces = 1;
        for (int i = 1; i < height; i++) {
            startSpaces += 2;
        }
        return startSpaces / 2;
    }

    public static void christmasTree(int height) {
        // part 3 of the exercise
        
        int spaces = maxSpaces(height);
        int previousStarCount = 0;
        
        for (int i = 1; i <= height; i++) {
            printSpaces(spaces);
            if (i > 1) {
                printStars(2 + previousStarCount);
                previousStarCount += 2;
            } else {
                printStars(1);
                previousStarCount += 1;
            }           
            
            spaces--;
        }
        int baseHeight = 2;
        int baseWidth = 3;
        printBase(baseHeight, baseWidth, height);
        
    }

    public static void main(String[] args) {
        // The tests are not checking the main, so you can modify it freely.
        System.out.println("---");
        printTriangle(5);
        System.out.println("---");
        printTriangle(3);
        System.out.println("---");
        christmasTree(4);
        System.out.println("---");
        christmasTree(10);
    }
}
