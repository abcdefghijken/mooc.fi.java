
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
 * @author xxx
 */
public class Warehouse {
    private Map<String,Integer> price;
    private Map<String,Integer> stock;
    
    public Warehouse() {
        this.price = new HashMap();
        this.stock = new HashMap();
    }
    
    public void addProduct(String product, int price, int stock) {
        this.price.put(product, price);
        this.stock.put(product, stock);
    }
    
    public int price(String product) {
        return this.price.getOrDefault(product, -99);
    }
    
    public int stock(String product) {
        return this.stock.getOrDefault(product, 0);
    }
    
    public boolean take(String product) {
        if (this.stock.containsKey(product)) {
            int stock = this.stock.get(product);
            
            if (stock > 0) {
                stock--;
                this.stock.put(product, stock);
                return true;
            }
        }
        
        return false;
    }
    
    public Set<String> products() {
        Set<String> set = new HashSet();
        
        for (String item: price.keySet()) {
            set.add(item);
        }
        
        return set;
    }
}
