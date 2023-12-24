
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
public class Stack {
    private ArrayList<String> array;
    
    public Stack() {
        array = new ArrayList();
    }
    
    public boolean isEmpty() {
        return array.isEmpty();
    }
    
    public void add(String value) {
        array.add(value);
    }
    
    public ArrayList<String> values() {
        return array;
    }
    
    public String take() {
        String value = array.get(array.size()-1);
        array.remove(array.size()-1);
        
        return value;
    }
}
