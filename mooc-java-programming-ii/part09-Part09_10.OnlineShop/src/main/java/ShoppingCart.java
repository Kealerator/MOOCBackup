import java.util.HashMap;
import java.util.Map;

public class ShoppingCart {

    private Map<String, Item> cartMap;

    public ShoppingCart() {
        this.cartMap = new HashMap<>();
    }

    public void add(String product, int price) {
        // adds an item to the cart that matches the product & the price given as the
        // parameters

        if (this.cartMap.containsKey(product)) {
            this.cartMap.get(product).increaseQuantity();
        }else {
            Item addable = new Item(product, 1, price);
            this.cartMap.put(product, addable);
        }

    }

    public int price() {
        // return the total price of the shopping cart
        int cartSum = 0;

        for (Item cartItem : this.cartMap.values()) {
            cartSum += cartItem.price();
        }
        return cartSum;
    }

    public void print() {
        // prints the Item -objects in the cart. The order is irrelevant

        for (Item cartItem : this.cartMap.values()) {
            System.out.println(cartItem);
        }
    }

}
