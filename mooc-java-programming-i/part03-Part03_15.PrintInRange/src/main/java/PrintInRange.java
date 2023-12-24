
import java.util.ArrayList;

public class PrintInRange {

    public static void main(String[] args) {
        // Try your method here
    }
    
    public static void printNumbersInRange(ArrayList<Integer> list, int first, int end) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) >= first && list.get(i) <= end) {
                System.out.println(list.get(i));
            }
        }
    }
    
}
