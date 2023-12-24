
import java.util.Scanner;

public class LiquidContainers {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int first = 0;
        int second = 0;
        
        while (true) {
            System.out.print("> ");

            System.out.println("First: " + first + "/100");
            System.out.println("Second: " + second + "/100");
            
            String input = scan.nextLine();
            if (input.equals("quit")) {
                break;
            }

            String[] parts = input.split(" ");

            String command = parts[0];
            int amount = Integer.valueOf(parts[1]);
            
            if (amount < 0) {
                continue;
            }
            
            if (command.equals("add")) {
                if (first + amount > 100) {
                    first = 100;
                } else {
                    first += amount;
                }
            }
            
            if (command.equals("move")) {
                if (amount >= first) {
                    second += first;
                    first = 0;
                } else if (amount < first) {
                    if (amount + second > 100) {
                        second = 100;
                        first -= amount;
                    } else {
                        first -= amount;
                        second += amount;
                    }
                }
            }
            
            if (command.equals("remove")) {
                if (amount >= second) {
                    second = 0;
                } else {
                    second -= amount;
                }
            }
            
        }
    }

}