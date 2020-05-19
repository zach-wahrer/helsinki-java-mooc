
public class Apartment {

    private int rooms;
    private int squares;
    private int princePerSquare;
    private int totalPrice;

    public Apartment(int rooms, int squares, int pricePerSquare) {
        this.rooms = rooms;
        this.squares = squares;
        this.princePerSquare = pricePerSquare;
        this.totalPrice = squares * pricePerSquare;
    }
    
    public boolean largerThan(Apartment compared) {
        return this.squares > compared.squares;
    }
    
    public int priceDifference(Apartment compared) {
        return Math.abs(this.totalPrice - compared.totalPrice);
    }
    
    public boolean moreExpensiveThan(Apartment compared) {
        return this.totalPrice > compared.totalPrice;
    }

}
