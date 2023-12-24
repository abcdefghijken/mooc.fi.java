
import java.util.Scanner;

public class DoubleInput {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Give a number:");
        String output = scanner.nextLine();
        double num = Double.valueOf(output);
        System.out.println("You gave the number " + num);
       

    }
}
