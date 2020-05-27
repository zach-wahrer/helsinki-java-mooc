

public class Main {

    public static void main(String[] args) {
        // You can test your program here
        BoxWithMaxWeight box1 = new BoxWithMaxWeight(1);
        box1.add(new Item("Chess set", 1));
        
        System.out.println(box1.isInBox(new Item("Cheese")));
        System.out.println(box1.isInBox(new Item("Chess set")));
        
        box1.add(new Item("Records", 1));
        System.out.println(box1.isInBox(new Item("Records")));
        
        System.out.println("---");
        
        OneItemBox oneItemBox = new OneItemBox();
        
        oneItemBox.add(new Item("Fish"));
        oneItemBox.add(new Item("Hair dryer"));
        System.out.println(oneItemBox.isInBox(new Item("Fish")));
        System.out.println(oneItemBox.isInBox(new Item("Hair dryer")));
        
        
        OneItemBox box = new OneItemBox();
        box.add(new Item("Saludo", 5));
        box.add(new Item("Pirkka", 5));

        System.out.println(box.isInBox(new Item("Saludo")));
        System.out.println(box.isInBox(new Item("Pirkka")));
    }
}
