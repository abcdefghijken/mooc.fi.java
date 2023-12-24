
import java.util.ArrayList;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author xxx
 */
public class UserInterface {
    private ArrayList<Integer> points;
    private ArrayList<Grade> grades;
    private Scanner scan;
    
    public UserInterface(Scanner scan) {
        this.points = new ArrayList();
        this.grades = new ArrayList();
        this.scan = scan;
    }
    
    public void start() {
        System.out.println("Enter point totals, -1 stops:");
                    
        while (true) {
            int input = Integer.valueOf(scan.nextLine());
            
            if (input == -1) {
                break;
            }
            
            if (input >= 0 && input <= 100) {
                points.add(input);
            }

        }
        
        printAverage();
        printAveragePassing();
        printPassPercentage();
        Grade grade = new Grade();
        grade.getGradesByPoints(points);
        grade.printGradeDistribution();
    }
    
    public ArrayList getPoints() {
        return points;
    }
    
    public void add(int point) {
        if (point >= 0 && point <= 100) {
            points.add(point);
        }
    }
    
    public double getAverage() {
        if (points.isEmpty()) {
            return 0;
        }
        
        int sum = 0;
        
        for (int point: points) {
            sum += point;
        }
        
        return (double)sum/points.size();
    }
    
    public void printAverage() {
        System.out.println("Point average (all): " + this.getAverage());
    }
    
    public double getAveragePassing() {
        if (points.isEmpty()) {
            return 0;
        }
        
        int sum = 0;
        int counter = 0;
        
        for (int point: points) {
            if (point >= 50) {
               sum += point; 
               counter++;
            }
        }
        
        return (double)sum/counter;
    }
    
    public void printAveragePassing() {
        if (this.getAveragePassing() == 0) {
            System.out.println("-");
        } else {
            System.out.println("Point average (passing): " + this.getAveragePassing());
        }
    }
    
    public double getPassPercentage() {
        if (points.isEmpty()) {
            return 0;
        }
        
        int counter = 0;
        
        for (int point: points) {
            if (point >= 50) {
               counter++;
            }
        }
        
        double result = (double)counter/points.size();
        
        return result * 100;
    } 
    
    public void printPassPercentage() {
        if (this.getPassPercentage() == 0) {
            System.out.println("Pass percentage: 0.0");
        } else {
            System.out.println("Pass percentage: " + this.getPassPercentage());
        }
    }
}
