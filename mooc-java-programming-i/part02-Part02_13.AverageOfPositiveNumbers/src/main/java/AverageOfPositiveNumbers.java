
import java.util.Scanner;

public class AverageOfPositiveNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int counter = 0;
        int sum = 0;
        
        while (true) {
            System.out.println("Give a number:");
            int num = Integer.valueOf(scanner.nextLine());
                    
            if (num == 0) {
                if (sum != 0) {
                    System.out.println(sum/(double)counter);
                } else {
                    System.out.println("Cannot calculate the average");
                }

                break;
            }
            
            if (num > 0) {
                sum = num + sum;
                counter++;
            }
        }        
    }
}
