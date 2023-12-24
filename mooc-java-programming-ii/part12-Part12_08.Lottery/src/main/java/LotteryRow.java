
import java.util.ArrayList;
import java.util.Random;

public class LotteryRow {

    private ArrayList<Integer> numbers;

    public LotteryRow() {
        // Draw the numbers when the LotteryRow is created
        this.randomizeNumbers();
    }

    public ArrayList<Integer> numbers() {
        return this.numbers;
    }

    public void randomizeNumbers() {
        // Initialize the list for numbers
        this.numbers = new ArrayList<>();
        // Implement the random number generation here
        Random random = new Random();
        int count = 0;
        
        while (count < 7) {
            int number = (random.nextInt(40)+1);
            if (!(containsNumber(number))) {
                numbers.add(number);
                count++;
            }
        }
        // the method containsNumber is probably useful
    }

    public boolean containsNumber(int number) {
        for (int num: numbers) {
            if (number == num) return true;
        }
        
        return false;
    }
}

