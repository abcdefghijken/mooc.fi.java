
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
public class Hold {
    private ArrayList<Suitcase> suitcases;
    private int max;
    private int counter;
    
    public Hold(int max) {
        suitcases = new ArrayList();
        this.max = max;
        this.counter = 0;
    }
    
    public void addSuitcase(Suitcase suitcase) {
        if (suitcase.totalWeight() <= max) {
            suitcases.add(suitcase);
            max -= suitcase.totalWeight();
            counter += suitcase.totalWeight();
        }
    }
    
    public String toString() {
        return suitcases.size() + " suitcases (" + counter + " kg)"; 
    }
    
    public void printItems() {
        for (int i = 0; i < suitcases.size(); i++) {
            ArrayList<Item> items = suitcases.get(i).getItems();
            for (int j = 0; j < items.size(); j++) {
                Item item = items.get(j);
                System.out.println(item);
            }
        }
        
    }
}
