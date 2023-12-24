
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
public class DictionaryOfManyTranslations {
    private HashMap<String, ArrayList<String>> hashmap;
    
    public DictionaryOfManyTranslations() {
        this.hashmap = new HashMap();
    }
    
    public void add(String word, String translation) {
        this.hashmap.putIfAbsent(word, new ArrayList<String>());
        this.hashmap.get(word).add(translation);
    }
    
    public ArrayList<String> translate(String word) {
        return this.hashmap.getOrDefault(word, new ArrayList());
    }
    
    public void remove(String word) {
        if (this.hashmap.containsKey(word)) {
            this.hashmap.remove(word);
        }
    }
}
