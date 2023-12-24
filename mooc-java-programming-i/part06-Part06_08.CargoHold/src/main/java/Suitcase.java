
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author xxx
 */
public class Suitcase {
    private ArrayList<Item> items;
    private int weight;
    private int counter;
    
    public Suitcase(int max) {
        this.items = new ArrayList();
        this.weight = max;
        this.counter = counter;
    }
    
    public void addItem(Item item) {
        if (item.getWeight() <= this.weight) {
            this.items.add(item);
            this.weight -= item.getWeight();
            this.counter += item.getWeight();
        }
    }
    
    public String toString() {
        if (items.isEmpty()) {
            return "no items (0 kgs)";
        }
        
        if (items.size() == 1) {
            return items.size() + " item " + "(" + counter + " kg)";
        }
        return items.size() + " items " + "(" + counter + " kg)";
    }
    
    public void printItems() {
        for (Item item: items) {
            System.out.println(item.toString());
        }
    }
    
    public int totalWeight() {
        int total = 0; 
        for (Item item: items) {
            total += item.getWeight();
        }
        
        return total;
    }
    
    public Item heaviestItem() {
        if (items.isEmpty()) {
            return null;
        }
        
        Item temp = items.get(0);
        
        for (Item item: items) {
            if (temp.getWeight() < item.getWeight()) {
                temp = item;
            }
        }
        
        return temp;
    }
    
    public ArrayList getItems() {
        return items;
    }
}
