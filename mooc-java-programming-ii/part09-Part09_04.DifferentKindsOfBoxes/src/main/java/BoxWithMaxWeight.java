
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
public class BoxWithMaxWeight extends Box {
    private int capacity;
    private ArrayList<Item> array;
    
    public BoxWithMaxWeight(int capacity) {
        this.capacity = capacity;
        array = new ArrayList();
    }
    
    public void add(Item item) {
        if (item.getWeight() <= capacity) {
            this.array.add(item);
            capacity -= item.getWeight();
        }
    }
    
    public boolean isInBox(Item item) {
        if (this.array.contains(item)) {
            return true;
        }
        
        return false;
    }
    
}
