
import java.util.Arrays;


public class MainProgram {

    public static void main(String[] args) {
        // write your test code here
//        int[] array = {3, 1, 5, 99, 3, 12};
//        System.out.println("Smallest: " + MainProgram.smallest(array));
//        System.out.println("Index of the smallest number: " + MainProgram.indexOfSmallest(array));
//        
//        int[] numbers = {-1, 6, 9, 8, 12};
//        System.out.println(MainProgram.indexOfSmallestFrom(numbers, 0));
//        System.out.println(MainProgram.indexOfSmallestFrom(numbers, 1));
//        System.out.println(MainProgram.indexOfSmallestFrom(numbers, 2));.
        
        int[] numbers = {8, 3, 7, 9, 1, 2, 4};
        MainProgram.sort(numbers);
    }
    
    public static int smallest(int[] array) {
        int temp = array[0];
        
        for (int i = 0; i < array.length; i++) {
            if (temp > array[i]) {
                temp = array[i];
            }
        }
        
        return temp;
    }
    
    public static int indexOfSmallest(int[] array) {
        int temp = array[0];
        int index = 0;
        
        for (int i = 0; i < array.length; i++) {
            if (temp > array[i]) {
                temp = array[i];
                index = i;
            }
        }
        
        return index;
    }

    public static int indexOfSmallestFrom(int[] array, int startIndex) {
        int temp = array[startIndex];
        int index = startIndex;
        
        for (int i = startIndex; i < array.length; i++) {
            if (temp > array[i]) {
                temp = array[i];
                index = i;
            }
        }
    
        return index;
    }
    
    public static void swap(int[] array, int index1, int index2) {
        int temp = array[index1];
        array[index1] = array[index2];
        array[index2] = temp;
    }
    
    public static void sort(int[] array) {
        for (int i = 0; i < array.length; i++) {
            swap(array, i, indexOfSmallestFrom(array, i));
            System.out.println(Arrays.toString(array));
        }
    }
}
