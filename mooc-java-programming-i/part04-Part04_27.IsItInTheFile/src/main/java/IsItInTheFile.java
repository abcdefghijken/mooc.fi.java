
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class IsItInTheFile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<String> array = new ArrayList<String>();
        System.out.println("Name of the file:");
        String file = scanner.nextLine();

        try (Scanner scan = new Scanner(Paths.get(file))) {
            while (scan.hasNextLine()) {
                String row = scan.nextLine();
                array.add(row);
            }
        } catch (Exception ex) {
            System.out.println("Reading the file " + file + " failed.");
        }
        
        System.out.println("Search for:");
        String searchedFor = scanner.nextLine();

        boolean found = false;
        
        for (int i = 0; i < array.size(); i++) {
            if (array.get(i).contains(searchedFor)) {
                System.out.println("Found!");
                found = true;
            }
        }
        
        if (found == false) {
            System.out.println("Not found.");
        }
    }
}
