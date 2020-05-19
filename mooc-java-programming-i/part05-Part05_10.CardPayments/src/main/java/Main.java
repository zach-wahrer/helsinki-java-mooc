
public class Main {

    public static void main(String[] args) {
        // write experimental main programs here
        PaymentCard anonCard = new PaymentCard(50);
        System.out.println(anonCard.balance());
        
        anonCard.takeMoney(1);
        System.out.println(anonCard.balance());
        
        anonCard.takeMoney(50);
        System.out.println(anonCard.balance());
        
        
        PaymentTerminal testTerm = new PaymentTerminal();
        System.out.println(testTerm.eatAffordably(5));
        
        System.out.println(testTerm.eatHeartily(4.3));
        
        
        System.out.println(testTerm.eatHeartily(anonCard));
        System.out.println(anonCard.balance());
        
        System.out.println(testTerm);
        
        testTerm.addMoneyToCard(anonCard, 1000);
        
        System.out.println(anonCard.balance());
          
    }
}

