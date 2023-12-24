
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class MainProgram {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Book> books = new ArrayList();
       
        while (true) {
            System.out.println("Input the name of the book, empty stops:");
            String input = scanner.nextLine();
            
            if (input.equals("")) {
                break;
            }
            
            System.out.println("Input the age recommendation:");
            int age = Integer.valueOf(scanner.nextLine());
            
            books.add(new Book(input, age));
        }
        
        Comparator<Book> comparator = Comparator.comparing(Book::getAge).thenComparing(Book::getTitle);
        Collections.sort(books, comparator);

        System.out.println(books.size() + " books in total.");
        System.out.println("\n");
        System.out.println("Books:");
        for (Book book: books) {
            System.out.println(book);
        }
        
    }

}
