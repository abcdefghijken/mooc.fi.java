
import java.util.ArrayList;
import java.util.Scanner;

public class IndexOfSmallest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<Integer> list = new ArrayList();
        
        while (true) {
            int number = Integer.valueOf(scanner.nextLine());
            
            if (number == 9999) {
                break;
            }
            
            list.add(number);
        }
        
        int temp = 9998;
        
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) < temp) {
                temp = list.get(i);
            }
        }

        System.out.println("Smallest number: " + temp);
        
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) == temp) {
                System.out.println("Found at index: " + i);
            }
        }
    }
}
