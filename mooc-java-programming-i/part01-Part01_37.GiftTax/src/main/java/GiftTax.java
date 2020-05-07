
import java.util.Scanner;

public class GiftTax {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Value of the gift?");
        int giftValue = Integer.valueOf(scan.nextLine());
        
        int lowerLimit = 0;
        double taxRate = 0;
        int taxAtLowerLimit = 0;
        
        if (giftValue >= 5000 && giftValue < 25000) {
            lowerLimit = 5000;
            taxAtLowerLimit = 100;
            taxRate = 0.08;
        } else if (giftValue >= 25000 && giftValue < 55000) {
            lowerLimit = 25000;
            taxAtLowerLimit = 1700;
            taxRate = 0.10;
        } else if (giftValue >= 55000 && giftValue < 200000) {
            lowerLimit = 55000;
            taxAtLowerLimit = 4700;
            taxRate = 0.12;
        } else if (giftValue >= 200000 && giftValue < 1000000) {
            lowerLimit = 200000;
            taxAtLowerLimit = 22100;
            taxRate = 0.15;
        } else {
            lowerLimit = 1000000;
            taxAtLowerLimit = 142100;
            taxRate = 0.17;
        }
        
        if (giftValue >= 5000) {
            double totalTax = taxAtLowerLimit + (giftValue - lowerLimit) * taxRate;
            System.out.println("Tax: " + totalTax);
        } else {
            System.out.println("No tax!");
        }
        
        
    }
}
