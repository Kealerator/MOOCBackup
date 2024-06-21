import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Warehouse {

    private Map<String, Integer> productPriceMap;
    private Map<String, Integer> productStockMap;

    public Warehouse() {
        this.productPriceMap = new HashMap<>();
        this.productStockMap = new HashMap<>();
    }

    public void addProduct(String product, int price, int stock) {
        // Adds a product to the warehouse with the price and stock balance given as
        // parameters

        productPriceMap.put(product, price);
        productStockMap.put(product, stock);
    }

    public int price(String product) {
        // return the price of the product it received as a parameter

        // if the product hasnt been added, return -99
        if (this.productPriceMap.containsKey(product)) {
            return this.productPriceMap.get(product);
        }
        return -99;
    }

    public int stock(String product) {
        // return the current remaining stock of the product.
        if (this.productStockMap.containsKey(product)) {
            return this.productStockMap.get(product);
        }

        // if the product hasn't been added, return 0
        return 0;
    }

    public boolean take(String product) {
        /*
         * reduces the stock remaining for the product it received as a parameter by 1
         * and returns true if there was stock remaining.
         * 
         * if the product was not available, the method return false.
         * 
         * A prodcuts stock can't go below zero.
         * 
         */

        if (this.productStockMap.containsKey(product)) {
            this.productStockMap.put(product, this.productStockMap.get(product) - 1);

            if (this.productStockMap.get(product) < 0) {
                this.productStockMap.put(product, 0);
            } else {
                return true;
            }
        }

        return false;
    }

    public Set<String> products() {
        // return the names of the products in the warehouse as a Set

        Set<String> keySets = this.productPriceMap.keySet();

        return keySets;

    }
}
