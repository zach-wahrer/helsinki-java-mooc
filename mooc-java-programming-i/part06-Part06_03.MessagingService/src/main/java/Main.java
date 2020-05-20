
public class Main {

    public static void main(String[] args) {

        // Try out your class here
        MessagingService service = new MessagingService();
        
        Message message1 = new Message("Zach", "This is only a test.");
        Message message2 = new Message("anon", "this is another test");
        
        service.add(message1);
        System.out.println(service.getMessages());
        
        service.add(message2);
        
        for (Message message: service.getMessages()) {
            System.out.println(message);
        }
    }
}
