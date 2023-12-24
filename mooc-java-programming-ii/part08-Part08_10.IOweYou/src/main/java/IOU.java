
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
public class IOU {
    private HashMap<String, Double> hashmap;

    public IOU() {
        hashmap = new HashMap<String, Double>();
    }

    public void setSum(String toWhom, double amt) {
        double temp = this.hashmap.getOrDefault(toWhom, 0.0);
        temp += amt;
        this.hashmap.put(toWhom, temp);
    }

    public double howMuchDoIOweTo(String toWhom) {
        return this.hashmap.getOrDefault(toWhom, 0.0);
    }
    
    public String sanitizeString(String input) {
        if (input == null) return null;
                
        String output = input.toLowerCase();
        output = output.trim();
        
        return output;
    }
}
