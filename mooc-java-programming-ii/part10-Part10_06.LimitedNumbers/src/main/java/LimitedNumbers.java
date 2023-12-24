
import java.util.ArrayList;
import java.util.Scanner;

public class LimitedNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> array = new ArrayList();

        while (true) {
            int input = Integer.valueOf(scanner.nextLine());
            
            if (input < 0) {
                break;
            }
            
            array.add(input);
        }
        
        array.stream().filter(i -> i <= 5 && i >= 1).forEach(i -> System.out.println(i));
    }
}
