
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class SportStatistics {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("File:");
        String file = scan.nextLine();
        
        System.out.println("Team:");
        String team = scan.nextLine();
        
        int counter = 0;
        int winCount = 0;
        int loseCount = 0;
        
        try (Scanner scanner = new Scanner(Paths.get(file))) {
            while (scanner.hasNextLine()) {
                String row = scanner.nextLine();
                
                String[] array = row.split(",");
                    if (array[0].equals(team) || array[1].equals(team)) {
                        counter++;
                        
                        if (array[0].equals(team) && Integer.valueOf(array[2]) < Integer.valueOf(array[3])) {
                            loseCount++;
                        } else {
                            winCount++;
                        }
                    }
                    
                
            }
            
            System.out.println("Games: " + counter);
            System.out.println("Wins: " + winCount);
            System.out.println("Losses: " + loseCount);
        } catch (Exception ex) {
            
        }
    }
}
