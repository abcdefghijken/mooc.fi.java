
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
public class Pipe<T> {
    private List<T> pipes;
    
    public Pipe() {
        pipes = new ArrayList();
    }
    
    public void putIntoPipe(T value) {
        pipes.add(value);
    }
    
    public T takeFromPipe() {
        if (pipes.isEmpty()) {
            return null;
        } else {
            return pipes.remove(0);
        }
    }
    
    public boolean isInPipe() {
        return !pipes.isEmpty();
    }
}
