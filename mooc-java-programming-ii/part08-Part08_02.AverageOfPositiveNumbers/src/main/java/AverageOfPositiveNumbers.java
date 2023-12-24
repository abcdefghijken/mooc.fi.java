
import java.util.Scanner;

public class AverageOfPositiveNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int counter = 0;
        int sum = 0;
        
        while (true) {
            int command = Integer.valueOf(scanner.nextLine());
            
            if (command == 0) {
                break;
            }
            
            if (command > 0) {
                counter++;
                sum += command;
            } 
        }
        
        if (sum > 0) {
            System.out.println((double)sum/counter);
        } else {
            System.out.println("Cannot calculate the average");
        }
    }
}
