/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author xxx
 */
public class Hideout<T> {
    private T hide;
    
    public Hideout() {
        this.hide = null;
    }
    
    public void putIntoHideout(T toHide) {
        this.hide = toHide;
    }
    
    public T takeFromHideout() {
        T item = hide;
        hide = null;
        return item;
    }
    
    public boolean isInHideOut() {
        return hide != null;
    }
}
