
import java.util.Scanner;

public class NameOfTheOldest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String name = new String();
        int oldest = 0;
                    
        while (true) {
            String input = scanner.nextLine();
            
            if (input.equals("")) {
                break;
            }
            
            String[] array = input.split(",");
            if (Integer.valueOf(array[1]) > oldest) {
                oldest = Integer.valueOf(array[1]);
                name = array[0];
            }
        }
        
        System.out.println("Name of the oldest: " + name);
    }
}
