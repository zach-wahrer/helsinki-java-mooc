

public class MainProgram {

    public static void main(String[] args) {
        // you can create test code here. Call the methods that you'll implement
        // during the course of this exercise
        
        Checker checker = new Checker();
        
        System.out.println(checker.isDayOfWeek("mon"));
        System.out.println(checker.isDayOfWeek("rah"));
        
        System.out.println(checker.allVowels("oi"));
        System.out.println(checker.allVowels("queue"));

    }
   
}
