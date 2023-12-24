
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
public class OneItemBox extends Box {
    private ArrayList<Item> array;
    
    public OneItemBox() {
        this.array = new ArrayList();
    }
    
    public void add(Item item) {
        if (this.array.size() == 0) {
            this.array.add(item);
        }
    }
    
    public boolean isInBox(Item item) {
        if (this.array.contains(item)) {
            return true;
        }
        
        return false;
    }
}
