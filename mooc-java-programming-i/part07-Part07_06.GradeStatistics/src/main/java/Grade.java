
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author xxx
 */
public class Grade {
    private ArrayList<Integer> grades;
    
    public Grade() {
        grades = new ArrayList();
    }
    
    public void getGradesByPoints(ArrayList<Integer> points) {
        for (int point: points) {
            if (point < 50) {
                grades.add(0);
            } else if (point < 60) {
                grades.add(1);
            } else if (point < 70) {
                grades.add(2);
            } else if (point < 80) {
                grades.add(3);
            } else if (point < 90) {
                grades.add(4);
            } else {
                grades.add(5);
            }
        }
    }
    
    public String getStars(int number) {
        String star = "";
        
        for (int i = 0; i < grades.size(); i++) {
            if (grades.get(i) == number) {
                star += "*";
            }
        }
        
        return star;
    }
    
    public void printGradeDistribution() {
        System.out.println("Grade distribution:");
        System.out.println("5: " + getStars(5));
        System.out.println("4: " + getStars(4));
        System.out.println("3: " + getStars(3));
        System.out.println("2: " + getStars(2));
        System.out.println("1: " + getStars(1));
        System.out.println("0: " + getStars(0));

    }
}
