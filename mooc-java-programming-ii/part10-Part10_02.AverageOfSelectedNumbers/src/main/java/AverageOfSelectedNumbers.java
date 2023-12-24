
import java.util.ArrayList;
import java.util.Scanner;

public class AverageOfSelectedNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> array = new ArrayList();
        
        System.out.println("Input numbers, type \"end\" to stop.");
        while (true) {
            String row = scanner.nextLine();
            
            if (row.equals("end")) {
                break;
            }
            
            array.add(row);            
        }
        
        System.out.println("Print the average of the negative numbers or the positive numbers? (n/p)");
        String choice = scanner.nextLine();
        
        if (choice.equals("n")) {
            double average = array.stream().mapToInt(s -> Integer.valueOf(s)).filter(result -> result < 0).average().getAsDouble();
            
            System.out.println("Average of the negative numbers: " + average);
        }
        
        if (choice.equals("p")) {
            double average = array.stream().mapToInt(s -> Integer.valueOf(s)).filter(result -> result > 0).average().getAsDouble();
            
            System.out.println("Average of the positive numbers: " + average);
        }

    }
}
