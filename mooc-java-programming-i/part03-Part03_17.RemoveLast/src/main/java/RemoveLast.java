
import java.util.ArrayList;

public class RemoveLast {

    public static void main(String[] args) {
        // Try your method in here
    }
    
    public static void removeLast(ArrayList list) {
        if (list.size() > 0) {
            list.remove(list.size()-1);
        }
    }

}
