
public class Apartment {

    private int rooms;
    private int squares;
    private int pricePerSquare;

    public Apartment(int rooms, int squares, int pricePerSquare) {
        this.rooms = rooms;
        this.squares = squares;
        this.pricePerSquare = pricePerSquare;
    }

    public boolean largerThan(Apartment compared){
        if (this.squares > compared.squares) {
            return true;
        } else {
            return false;
        }
    }

    public int priceDifference(Apartment compared){
        //The price difference is the absolute value of the difference of the prices
        //(price can be calculated by multiplying the price per square by the number of squares).

        int priceA = this.pricePerSquare * this.squares;
        int priceB = compared.pricePerSquare * compared.squares;

        if(priceA - priceB < 0){
            return (priceA - priceB) * -1;
        } else {
            return priceA - priceB;
        }
    }

    public boolean moreExpensiveThan(Apartment compared){
        if (this.pricePerSquare * this.squares > compared.pricePerSquare * compared.squares) {
            return true;
        } else {
            return false;
        }
    }
}
