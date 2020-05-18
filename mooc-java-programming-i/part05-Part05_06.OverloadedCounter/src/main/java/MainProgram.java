
public class MainProgram {

    public static void main(String[] args) {
        // Test your counter here
        Counter zeroCounter = new Counter();
        Counter tenCounter = new Counter(10);
        System.out.println(zeroCounter);
        System.out.println(tenCounter);
        
        zeroCounter.increase();
        tenCounter.increase(10);
        
        System.out.println(zeroCounter);
        System.out.println(tenCounter);
    }
}
