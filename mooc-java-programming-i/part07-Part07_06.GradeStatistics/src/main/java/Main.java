
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //String text = "-42\n" + "24\n" + "42\n" + "72\n" + "80\n" + "52\n" + "-1";
        //scanner = new Scanner(text);
        UserInterface ui = new UserInterface(scanner);
        ui.start();
        // Write your program here -- consider breaking the program into 
        // multiple classes.
    }
}
