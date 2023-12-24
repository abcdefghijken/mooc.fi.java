
import java.util.ArrayList;
import java.util.List;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author xxx
 */
public class Herd implements Movable {
    private List<Movable> herd;
    
    public Herd() {
        this.herd = new ArrayList();
    }
    
    public void addToHerd(Movable movable) {
        this.herd.add(movable);
    }
    
    public void move(int dx, int dy) {
        for (Movable item: herd) {
            item.move(dx, dy);
        }
    }
    
    public String toString() {
        String result = "";
        
        for (Movable item: herd) {
            result += item.toString();
            result += "\n";
        }
        
        return result;
    }
}
