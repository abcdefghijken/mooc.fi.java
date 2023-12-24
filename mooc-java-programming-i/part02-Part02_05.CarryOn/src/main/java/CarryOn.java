
import java.util.Scanner;

public class CarryOn {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        boolean input = true;
                
        while (input) {
            System.out.println("Shall we carry on?");
            String userInput = scanner.nextLine();
            
            if (userInput.equals("no")) {
                input = false;
            }
        }
    }
}
