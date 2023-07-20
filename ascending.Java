import java.util.Arrays;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        String[] fruits = {"banana", "apple", "orange", "grape", "kiwi"};

        // Sort the array of strings in ascending order
        Arrays.sort(fruits);

        // Print the sorted array
        for (String fruit : fruits) {
            System.out.print(fruit + " ");
        }
        // Output: apple banana grape kiwi orange
    }
}
