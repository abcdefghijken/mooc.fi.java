
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
public class HashMap<K,V> {
    private List<Pair<K,V>>[] values;
    // An array where each element is a List holding key-value pairs (Pairs of type K and V)
    private int firstFreeIndex;
    
    public HashMap() {
        this.values = new List[32];
        this.firstFreeIndex = 0;
    }
    
    public V get(K key) {
        int hashValue = Math.abs(key.hashCode() % this.values.length);
        // hashCode to determine index, % to make sure indexing stays within the length of array.
        if (this.values[hashValue] == null) return null;
        
        List<Pair<K,V>> valuesAtIndex = this.values[hashValue];
        // check the values at this index (a list) - it holds the key/value pair
        
        for (int i = 0; i < valuesAtIndex.size(); i++) {
            if (valuesAtIndex.get(i).getKey().equals(key)) {
                return valuesAtIndex.get(i).getValue();
            }
        }
        // iterate through the container that holds the key/value pair. can have multiple pairs if hashcode collide.
        
        return null;
    }
    
    public void addLongWay(K key, V value) {
        // hashCode to determine index, % to make sure indexing stays within the length of array.
        int hashValue = Math.abs(key.hashCode() % this.values.length);
        if (values[hashValue] == null) {
            values[hashValue] = new ArrayList<>();
        }
        
        // get the container at the index, if no container, create a new one
        List<Pair<K,V>> valuesAtIndex = this.values[hashValue];
        
        int index = -1;
        
        // iterate through existing container to check if key exists. if it does, just replace the value.
        for (int i = 0; i < valuesAtIndex.size(); i++) {
            if (valuesAtIndex.get(i).getKey().equals(key)) {
                index = i;
                break;
            }
        }
        
        // if index is -1 means there is no key, add key/value pair
        // if not, replace the value
        if (index < 0) {
            valuesAtIndex.add(new Pair(key, value));
            this.firstFreeIndex++;
        } else {
            valuesAtIndex.get(index).setValue(value);
        }
    }
    
    public void add(K key, V value) {
        List<Pair<K, V>> valuesAtIndex = getListBasedOnKey(key);
        int index = getIndexOfKey(valuesAtIndex, key);
        
        if (index < 0) {
            valuesAtIndex.add(new Pair(key, value));
            this.firstFreeIndex++;
        } else {
            valuesAtIndex.get(index).setValue(value);
        }
        
        if (1.0 * this.firstFreeIndex/this.values.length > 0.75) {
            grow();
        }
    }
    
    private List<Pair<K,V>> getListBasedOnKey(K key) {
        int hashValue = Math.abs(key.hashCode() % this.values.length);
        
        if (this.values[hashValue] == null) values[hashValue] = new ArrayList<>();
        
        return this.values[hashValue];
    }
    
    private int getIndexOfKey(List<Pair<K,V>> list, K key) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getKey().equals(key)) {
                return i;
            }
        }
        
        return -1;
    }
    
    private void grow() {
        // create a new array
        List<Pair<K, V>>[] newArray = new List[this.values.length * 2];
        
        for (int i = 0; i < this.values.length; i++) {
            copy(newArray, i);
        }
        
        this.values = newArray;
    }
    
    private void copy(List<Pair<K, V>>[] newArray, int fromIdx) {
        for (int i = 0; i < this.values[fromIdx].size(); i++) {
            Pair<K, V> value = this.values[fromIdx].get(i);
            
            int hashValue = Math.abs(value.getKey().hashCode() % newArray.length);
            if (newArray[hashValue] == null) newArray[hashValue] = new ArrayList();
        
            newArray[hashValue].add(value);
        }
    } 
    
    public V remove(K key) {
        List<Pair<K, V>> valuesAtIndex = getListBasedOnKey(key);
        
        if (valuesAtIndex.isEmpty()) return null;
        
        int index = getIndexOfKey(valuesAtIndex, key);
        if (index < 0) return null;
        
        Pair<K, V> pair = valuesAtIndex.get(index);
        valuesAtIndex.remove(pair);
        return pair.getValue();
    }
}
