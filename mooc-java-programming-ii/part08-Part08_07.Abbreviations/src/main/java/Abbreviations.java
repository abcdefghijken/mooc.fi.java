
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
public class Abbreviations {
    private HashMap<String,String> hash;
    
    public Abbreviations() {
        hash = new HashMap<String,String>();
    }
    
    public void addAbbreviation(String abbreviation, String explanation) {
        if (!(abbreviation == null || explanation == null)) {
            String formatAbb = sanitizeString(abbreviation);
            String formatEx = sanitizeString(explanation);
            
            hash.put(formatAbb, formatEx);
        }
    }
    
    public boolean hasAbbreviation(String abbreviation) {
        String formatAbb = sanitizeString(abbreviation);
        
        if (hash.containsKey(formatAbb)) {
            return true;
        }
        
        return false;
    }
    
    public String findExplanationFor(String abbreviation) {
        String formatAbb = sanitizeString(abbreviation);
        
        if (hasAbbreviation(formatAbb)) {
            return hash.get(formatAbb);
        }
        
        return null;
    }
    
    public String sanitizeString(String input) {
        if (input == null) {
            return null;
        }
        
        String output = input.toLowerCase();
        output = output.trim();
        
        return output;
    }
}
