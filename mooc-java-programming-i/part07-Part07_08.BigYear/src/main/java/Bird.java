/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author xxx
 */
public class Bird {
    String name;
    String latin;
    int observation;
    
    public Bird(String name, String latin) {
        this.name = name;
        this.latin = latin;
        this.observation = 0;
    }
    
    public String toString() {
        return this.name + " (" + this.latin + ")";
    }
    
    public void addObservation() {
        this.observation++;
    }
    
    public String getName() {
        return this.name;
    }
    
    public String getLatin() {
        return this.name;
    }
    
    public int getObservation() {
        return this.observation;
    }
}
