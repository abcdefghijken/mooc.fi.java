
import java.util.Scanner;

public class AverageOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int counter = 0;
        int sum = 0;
        
        while (true) {
            System.out.println("Give a number:");
            int num = Integer.valueOf(scanner.nextLine());
                    
            if (num == 0) {
                System.out.println("Average of the numbers: " + sum/(double)counter);
                break;
            }
            
            sum = num + sum;
            counter++;
        }        
    }
}
