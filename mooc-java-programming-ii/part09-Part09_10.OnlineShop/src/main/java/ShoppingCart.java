
import java.util.HashMap;
import java.util.Map;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author xxx
 */
public class ShoppingCart {
    private Map<String, Item> cart;
    
    public ShoppingCart() {
        this.cart = new HashMap();
    }
    
    public void add(String product, int price) {
        if (cart.containsKey(product)) {
            Item item = cart.get(product);
            item.increaseQuantity();
            cart.put(product, item);
        } else {
            int qty = 1;
            Item item = new Item(product, qty, price * qty);
            cart.put(product, item);
        }
    }
    
    public int price() {
        int total = 0;
        
        for (Item item: cart.values()) {
            total += item.price();
        }
        
        return total;
    }
    
    public void print() {
        for (Item item: cart.values()) {
            System.out.println(item.toString());
        }
    }
}
