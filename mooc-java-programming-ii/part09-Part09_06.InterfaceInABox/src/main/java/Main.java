
public class Main {

    public static void main(String[] args) {
        // test your classes here
        Book book1 = new Book("Zachariah Wahrer", "Breakers of the Dawn", 2);
        CD cd1 = new CD("Busted Knuckles", "DownSeason", 2002);
        
        
        Box box1 = new Box(10);
        box1.add(book1);
        box1.add(cd1);
        
        Box box2 = new Box(30);
        for (int i = 0; i < 5; i++) {
            box2.add(book1);
        }
   
        box2.add(box1);
        System.out.println(box2);

    }

}
