
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
public class Package {
    private ArrayList<Gift> array;
    
    public Package() {
        array = new ArrayList();
    }
    
    public void addGift(Gift gift) {
        array.add(gift);
    }
    
    public int totalWeight() {
        int total = 0;
        
        for (Gift item: array) {
            total += item.getWeight();
        }
        
        return total;
    }
}
