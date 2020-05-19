
public class Main {

    public static void main(String[] args) {
        // write experimental code here to check how your program functions
        Person anon = new Person("Anon", 35, 180, 70);
        HealthStation backAlley = new HealthStation();
        
        System.out.println(backAlley.weigh(anon));
        
        backAlley.feed(anon);
        System.out.println(backAlley.weigh(anon));
        
        System.out.println(backAlley.weighings());
    }
}
