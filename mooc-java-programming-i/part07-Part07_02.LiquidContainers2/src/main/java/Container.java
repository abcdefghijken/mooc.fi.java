/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author k-en
 */
public class Container {
    private int amount;
    
    public Container() { }
    
    public int contains() {
        return amount;
    }
    
    public void add(int amount) {
        if (!(amount < 0)) {
            if (this.amount + amount < 100) {
                this.amount += amount;
            } else {
                this.amount = 100;
            }
        }
    }
    
    public void remove(int amount) {
        if (!(amount < 0)) {
            if (this.amount - amount > 0) {
                this.amount -= amount;
            } else {
                this.amount = 0;
            }
        }
    }
    
    public String toString() {
        return this.amount + "/100";
    }
}
