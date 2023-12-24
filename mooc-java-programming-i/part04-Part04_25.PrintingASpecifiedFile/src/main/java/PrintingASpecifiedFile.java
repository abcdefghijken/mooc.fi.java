
import java.nio.file.Paths;
import java.util.Scanner;

public class PrintingASpecifiedFile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Which file should have its content printed?");
        
        String choice = scanner.nextLine();
        
        try (Scanner scan = new Scanner(Paths.get(choice))) {
            while (scan.hasNextLine()) {
                String row = scan.nextLine();
                System.out.println(row);
            }
            
        } catch (Exception ex) {
            
        }
    }
}
