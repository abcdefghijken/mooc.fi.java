
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] numbers = {8, -2, 3, 1, 1};
        System.out.println(sum(numbers, 0, numbers.length, 0, 999));

    }
    
    public static int sum(int[] array, int from, int to, int smallest, int largest) {
        if (from < 0) from = 0;
        if (to > array.length) to = array.length;
        int sum = 0;
        
        for (int i = from; i < to; i++) {
            if (array[i] <= largest && array[i] >= smallest) {
                sum += array[i];
            }
        }
        
        return sum;
    }

}
