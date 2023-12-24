
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author xxx
 */
public class Hand implements Comparable<Hand> {
    private ArrayList<Card> hand;
    
    public Hand() {
        this.hand = new ArrayList();
    }
    
    public void add(Card card) {
        this.hand.add(card);
    }
    
    public void print() {
        Iterator<Card> ite = this.hand.iterator();
        
        while (ite.hasNext()) {
            Card card = ite.next();
            System.out.println(card);
        }
    }
    
    public void sort() {
        Collections.sort(hand);
    }
    
    @Override
    public int compareTo(Hand compared) {
        int sum = 0;
        int comparedSum = 0;
        
        for (Card card: hand) {
            sum += card.getValue();
        }
        
        ArrayList<Card> comparedArray = compared.hand;
        
        for (Card card: comparedArray) {
            comparedSum += card.getValue();
        }
        
        return sum - comparedSum;
    }
    
    public void sortBySuit() {
        BySuitInValueOrder sortBySuit = new BySuitInValueOrder();
        Collections.sort(this.hand, sortBySuit);
    }
}
