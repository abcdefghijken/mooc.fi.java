
import java.util.ArrayList;
import java.util.Random;
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
    private Scanner scan;
    private ArrayList<Bird> birds;
    
    public UserInterface(Scanner scan) {
        this.scan = scan;
        birds = new ArrayList();
    }
    
    public void start() {
        while (true) {
            System.out.println("?");
            String command = scan.nextLine();
            
            if (command.equals("Quit")) {
                break;
            }
            
            if (command.equals("Add")) {
                System.out.println("Name:");
                String name = scan.nextLine();
                System.out.println("Name in Latin:");
                String latin = scan.nextLine();
                addBird(name, latin);
                continue;
            }
            
            if (command.equals("Observation")) {
                System.out.println("Bird?");
                String name = scan.nextLine();
                addObservation(name);
                continue;
            }
            
            if (command.equals("All")) {
                printBirds();
                continue;
            }
            
            if (command.equals("One")) {
                System.out.println("Bird?");
                String name = scan.nextLine();
                printBird(name);
                continue;
            }
        }
    }
    
    public void addBird(Bird bird) {
        this.birds.add(bird);
    }
    
    public void addBird(String name, String latin) {
        this.birds.add(new Bird(name, latin));
    }
    
    public void addObservation(String name) {
        for (Bird bird: birds) {
            if (bird.getName().contains(name)) {
                bird.addObservation();
            } else {
                System.out.println("Not a bird!");
            }
        }
    }
    
    public void printBirds() {
        for (Bird bird: birds) {
            System.out.println(bird + ": " + bird.getObservation() + " observations");
        }
    }
    
    public void printBird(String name) {
        for (Bird bird: birds) {
            if (bird.getName().contains(name)) {
                System.out.println(bird + ": " + bird.getObservation() + " observations");
            } else {
                System.out.println("Not a bird!");
            }
        }
    }
}
