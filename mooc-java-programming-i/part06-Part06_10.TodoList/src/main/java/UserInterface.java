
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
    private TodoList list;
    private Scanner scan;
    
    public UserInterface(TodoList list, Scanner scan) {
        this.list = list;
        this.scan = scan;
    }
    
    public void start() {
        while (true) {
            System.out.println("Command:");
            String command = scan.nextLine();
            
            if (command.equals("stop")) {
                break;
            }
            
            if (command.equals("add")) {
                System.out.println("To add:");
                String task = scan.nextLine();
                list.add(task);
            }
            
            if (command.equals("list")) {
                list.print();
            }
            
            if (command.equals("remove")) {
                System.out.println("Which one is removed?");
                int remove = Integer.valueOf(scan.nextLine());
                list.remove(remove);
            }
        }
    }
}
