
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
public class ChangeHistory {
    private ArrayList<Double> history;
    
    public ChangeHistory() {
        this.history = new ArrayList();
    }
    
    public void add(double status) {
        this.history.add(status);
    }
    
    public void clear() {
        this.history.clear();
    }
    
    public String toString() {
        return this.history.toString();
    }
    
    public double maxValue() {        
        if (history.size() == 0) return 0;
        
        double temp = history.get(0);
        
        for (double item: history) {
            if (item > temp) {
                temp = item;
            }
        }
        
        return temp;
    }
    
    public double minValue() {        
        if (history.size() == 0) return 0;
        
        double temp = history.get(0);
        
        for (double item: history) {
            if (item < temp) {
                temp = item;
            }
        }
        
        return temp;
    }
    
    public double average() {
        double temp = 0.0;
        
        if (history.size() == 0) return 0;
        
        for (double item: history) {
            temp += item;
        }
        
        return temp/history.size();
    }
}
