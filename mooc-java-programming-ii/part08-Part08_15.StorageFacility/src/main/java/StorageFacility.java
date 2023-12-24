
import java.util.ArrayList;
import java.util.HashMap;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author xxx
 */
public class StorageFacility {
    private HashMap<String, ArrayList<String>> hashmap;
    
    public StorageFacility() {
        this.hashmap = new HashMap();
    }
    
    public void add(String unit, String item) {
        this.hashmap.putIfAbsent(unit, new ArrayList());
        this.hashmap.get(unit).add(item);
    }
    
    public ArrayList<String> contents(String unit) {
        return this.hashmap.getOrDefault(unit, new ArrayList());
    }
    
    public void remove(String unit, String item) {
        if (this.hashmap.containsKey(unit)) {
            ArrayList<String> array = this.hashmap.get(unit);
            
            array.remove(item);
            
            if (array.size() == 0) {
                this.hashmap.remove(unit);
            }
        }
    }
    
    public ArrayList<String> storageUnits() {
        ArrayList<String> result = new ArrayList();
        
        for (String item: this.hashmap.keySet()) {
            ArrayList<String> array = this.hashmap.get(item);
            if (array == null || array.size() == 0) {
                continue;
            } else {
                result.add(item);
            }
        }
        
        return result;
    }
}
