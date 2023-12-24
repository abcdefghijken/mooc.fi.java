
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class NumbersFromAFile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("File? ");
        String file = scanner.nextLine();
        System.out.print("Lower bound? ");
        int lowerBound = Integer.valueOf(scanner.nextLine());
        System.out.print("Upper bound? ");
        int upperBound = Integer.valueOf(scanner.nextLine());
        
        ArrayList<Integer> array = new ArrayList<Integer>();
        int counter = 0;
        
        try (Scanner scan = new Scanner(Paths.get(file))) {
            while (scan.hasNextLine()) {
                int row = Integer.valueOf(scan.nextLine());
                array.add(row);
            }
        } catch (Exception ex) {
            
        }
        
        for (int i = 0; i < array.size(); i++) {
            if (array.get(i) >= lowerBound && array.get(i) <= upperBound) {
                counter++;
            }
        }
        
        System.out.println("Numbers: " + counter);

    }

}
