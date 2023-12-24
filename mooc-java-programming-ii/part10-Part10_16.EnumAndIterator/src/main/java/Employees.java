
import java.util.ArrayList;
import java.util.Iterator;
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
public class Employees {
    private ArrayList<Person> persons;
    
    public Employees() {
        this.persons = new ArrayList();
    }
    
    public void add(Person personToAdd) {
        this.persons.add(personToAdd);
    }
    
    public void add(List<Person> peopleToAdd) {
        Iterator<Person> ite = peopleToAdd.iterator();
        
        while (ite.hasNext()) {
            Person temp = ite.next();
            this.persons.add(temp);
        }
    }
    
    public void print() {
        Iterator<Person> ite = this.persons.iterator();
        
        while (ite.hasNext()) {
            System.out.println(ite.next());
        }
    }
    
    public void print(Education education) {
        Iterator<Person> ite = this.persons.iterator();
        
        while (ite.hasNext()) {
            Person temp = ite.next();
            if (temp.getEducation() == education) {
                System.out.println(temp);
            }
        }
    }
    
    public void fire(Education education) {
        Iterator<Person> ite = this.persons.iterator();
        
        while (ite.hasNext()) {
            Person temp = ite.next();
            if (temp.getEducation() == education) {
                ite.remove();
            }
        }
    }
}
