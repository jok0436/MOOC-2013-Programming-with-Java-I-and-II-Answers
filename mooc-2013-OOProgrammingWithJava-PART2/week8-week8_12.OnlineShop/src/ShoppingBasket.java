
import java.util.HashMap;
import java.util.Map;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author josia
 */
public class ShoppingBasket {

    private Map<String, Purchase> purchases = new HashMap<String, Purchase>();

    public void add(String product, int price) {
        if (searchForItem(product)) {
            purchases.get(product).increaseAmount();
        } else {
            purchases.put(product, new Purchase(product, 1, price));
        }
    }

    public int price() {
        int output = 0;
        for (Purchase purchase : purchases.values()) {
            output += purchase.price();
        }
        return output;
    }

    public void print() {
        for (Purchase purchase : purchases.values()) {
            System.out.println(purchase);
        }
    }

    public boolean searchForItem(String item) {
        for (Purchase purchase : purchases.values()) {
            if (purchase.product().equals(item)) {
                return true;
            }
        }
        return false;
    }
}
