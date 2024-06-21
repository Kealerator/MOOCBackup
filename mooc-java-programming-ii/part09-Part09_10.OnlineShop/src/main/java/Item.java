public class Item {
    
    private String product;
    private int qty;
    private int unitPrice;

    public Item(String product, int qty, int unitPrice) {
        /*
         * Constructor that creates an item corresponding to the product given as
         * parameter.
         * 
         * Qty tells how many of the product are in the item.
         * unitPrice is the price of a single product.
         */

         this.product = product;
         this. qty = qty;
         this.unitPrice = unitPrice;

    }

    public int price() {
        // return the price of the item. You get the items price by multiplying with qty
        return this.unitPrice * this.qty;
    }

    public void increaseQuantity() {
        // inrease the quantity by one.
        this.qty++;
    }

    public String toString() {
        /*
         * return s the string representation of the item. Must match the format:
         *  "milk: 4"
         * (<product>: [qty])
         * 
         */
        return this.product + ": " + this.qty;
    }
}
