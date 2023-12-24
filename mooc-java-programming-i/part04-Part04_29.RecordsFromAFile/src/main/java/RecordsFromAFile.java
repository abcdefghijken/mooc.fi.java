
import java.nio.file.Paths;
import java.util.Scanner;

public class RecordsFromAFile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Name of the file:");
        String file = scanner.nextLine();
        
        
        try (Scanner scan = new Scanner(Paths.get(file))) {
            while (scan.hasNextLine()) {
                String row = scan.nextLine();
                
                String[] array = row.split(",");
                
                System.out.println(array[0] + ", age: " + array[1] + " years");
            }
        } catch (Exception ex) {
            
        }
    }
}
