
public class Main {

    public static void main(String[] args) {
        // Test your code here!
        TripleTacoBox tripleTacos = new TripleTacoBox();
        System.out.println(tripleTacos.tacosRemaining());
        tripleTacos.eat();
        tripleTacos.eat();
        System.out.println(tripleTacos.tacosRemaining());
        tripleTacos.eat();
        tripleTacos.eat();
        System.out.println(tripleTacos.tacosRemaining());
        
        CustomTacoBox oneTaco = new CustomTacoBox(1);
        oneTaco.eat();
        System.out.println(oneTaco.tacosRemaining());
        
    }
}
