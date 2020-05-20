
public class Main {

    public static void main(String[] args) {


        // use this main method to try out your classes!
        Gift book = new Gift("Test Book", 10);
        Gift toy = new Gift("Test Toy", 5);
           
        Package mailing = new Package();
        mailing.addGift(book);
        mailing.addGift(toy);
        System.out.println(mailing.totalWeight());
        
    }
}
