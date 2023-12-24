
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
public class Room {
    private ArrayList<Person> array;
    
    public Room() {
        array = new ArrayList();
    }
    
    public void add(Person person) {
        array.add(person);
    }
    
    public boolean isEmpty() {
        if (array.isEmpty()) {
            return true;
        }
        
        return false;
    }
    
    public ArrayList<Person> getPersons() {
        return array;
    }
    
    public Person shortest() {
        if (array.isEmpty()) {
            return null;
        }
        
        Person temp = array.get(0);
        
        for (Person item: array) {
            if (temp.getHeight() > item.getHeight()) {
                temp = item;
            }
        }
        
        return temp;
    }
    
    public Person take() {
        if (array.isEmpty()) {
            return null;
        }
        
        Person result = shortest();
        array.remove(shortest());
        
        return result;
    }
}
