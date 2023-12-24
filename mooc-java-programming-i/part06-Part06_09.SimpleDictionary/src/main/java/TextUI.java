
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
public class TextUI {
    private Scanner scan;
    private SimpleDictionary sd;
    
    public TextUI(Scanner scan, SimpleDictionary sd) {
        this.scan = scan;
        this.sd = sd;
    }
    
    public void start() {
        while (true) {
            System.out.println("Command:");
            String command = scan.nextLine();

            if (command.equals("end")) {
                System.out.println("Bye bye!");
                break;
            }
            
            if (command.equals("add")) {
                System.out.println("Word:");
                String word = scan.nextLine();
                System.out.println("Translation:");
                String translation = scan.nextLine();
                sd.add(word, translation);
                continue;
            }
            
            if (command.equals("search")) {
                System.out.println("To be translated:");
                String tobe = scan.nextLine();
                
                if (sd.translate(tobe) == null) {
                    System.out.println("Word " + tobe + " was not found");
                } else {
                    System.out.println(sd.translate(tobe));
                }
                continue;
            }
            
            System.out.println("Unknown command");
        }
        
    }
}
