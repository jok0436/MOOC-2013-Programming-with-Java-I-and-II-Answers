
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author josia
 */
public class Storehouse {

    private Map<String, Integer> prices = new HashMap<String, Integer>();
    private Map<String, Integer> stocks = new HashMap<String, Integer>();

    public void addProduct(String product, int price, int stock) {
        for (int i = 0; i < stock; i++) {
            stocks.put(product, stock);
            prices.put(product, price);
        }
    }

    public int price(String product) {
        for (String key : prices.keySet()) {
            if (key.equals(product)) {
                return prices.get(key);
            }
        }
        return -99;
    }

    public int stock(String product) {
        for (String key : stocks.keySet()) {
            if (key.equals(product)) {
                return stocks.get(key);
            }
        }
        return 0;
    }

    public boolean take(String product) {
        if (stocks.containsKey(product)) {
            int value = stocks.get(product);
            if (value > 0) {
                stocks.remove(product);
                stocks.put(product, value - 1);
                return true;
            }
        }
        return false;
    }

    public Set<String> products() {
        Set<String> allProducts = new HashSet<String>();
        for (String product : stocks.keySet()) {
            allProducts.add(product);
        }
        return allProducts;
    }
}
