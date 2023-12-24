
import java.util.ArrayList;
import java.util.Scanner;

public class PersonalDetails {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String longest = new String();
        int sum = 0;
        int counter = 0;
        
        while (true) {
            String input = scanner.nextLine();
            
            if (input.equals("")) {
                break;
            }
            
            String[] array = input.split(",");
            
            if (array[0].length() > longest.length()) {
                longest = array[0];
            }
            
            sum += Integer.valueOf(array[1]);
            counter++;
        }
        
        System.out.println("Longest name: " + longest);
        System.out.println("Average of the birth years: " + 1.0*sum/counter);
    }
}
