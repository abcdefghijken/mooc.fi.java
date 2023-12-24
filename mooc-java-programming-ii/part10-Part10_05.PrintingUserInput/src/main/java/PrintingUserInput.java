
import java.util.ArrayList;
import java.util.Scanner;

public class PrintingUserInput {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> array = new ArrayList();
        
        while (true) {
            String row = scanner.nextLine();
            
            if (row.equals("")) {
                break;
            }
            
            array.add(row);
        }
        
        array.stream().forEach(row -> System.out.println(row));
    }
}
