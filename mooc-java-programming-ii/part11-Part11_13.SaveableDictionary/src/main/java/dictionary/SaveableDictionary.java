/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dictionary;

import java.io.PrintWriter;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 *
 * @author xxx
 */
public class SaveableDictionary {
    private Map<String,String> dictionary;
    private String file;
    
    public SaveableDictionary() {
        this.dictionary = new HashMap();
    }
    
    public SaveableDictionary(String file) {
        this.dictionary = new HashMap();
        this.file = file;
    }
    
    public boolean load() {
        try (Scanner fileReader = new Scanner(Paths.get(file))) {
            while (fileReader.hasNextLine()) {
                String row = fileReader.nextLine();
                String[] parts = row.split(":");
                add(parts[0], parts[1]);
            }
            
            return true;
        } catch (Exception e) {
            System.out.println("Unable to read file: " + e.getMessage());
            throw new IllegalArgumentException();
        }
    }
    
    public void add(String word, String translation) {
        this.dictionary.putIfAbsent(word, translation);
    }
    
    public String translate(String word) {
        for (String w: this.dictionary.keySet()) {
            if (w.equals(word)) {
                return this.dictionary.get(w);
            } else if (word.equals(this.dictionary.get(w))) {
                    return w;
                }
            }
        
        return null;
    }
    
    public void delete(String word) {
        if (this.dictionary.containsKey(word)) {
            this.dictionary.remove(word);
        }
        
        String keyValue = new String();
        
        if (this.dictionary.values().contains(word)) {
            for (String key : this.dictionary.keySet()) {
                if (this.dictionary.get(key).equals(word)) {
                    keyValue = key;
                }
            }
            
            this.dictionary.remove(keyValue);
        }
    }
    
    public boolean save() {
        try (PrintWriter pw = new PrintWriter(this.file)) {
            for (String item: this.dictionary.keySet()) {
                pw.println(item + ":" + this.dictionary.get(item));
            }
            
            pw.close();
        } catch (Exception e) {
            System.out.println("Unable to write file: " + e.getMessage());
            throw new IllegalArgumentException();
        }
        
        return true;
    }
}
