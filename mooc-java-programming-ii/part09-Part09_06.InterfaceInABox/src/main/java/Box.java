
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
public class Box implements Packable {
    private double capacity;
    private ArrayList<Packable> array;
    
    public Box(double capacity) {
        this.capacity = capacity;
        this.array = new ArrayList();
    }
    
    public void add(Packable item) {
        if (item.weight() <= this.capacity) {
            this.capacity -= item.weight();
            array.add(item);
        }
    }
    
    public double weight() {
        double weight = 0.0;
        
        for (Packable item: array) {
            weight += item.weight();
        }
        
        return weight;
    }
    
    public String toString() {
        return "Box: " + array.size() + " items, total weight " + this.weight() + " kg";
    }
}
