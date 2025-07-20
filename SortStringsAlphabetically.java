import java.util.Arrays;
public class SortStringsAlphabetically {
    public static void main(String[] args) {
        // Array of strings
        String[] words = {"banana", "apple", "orange", "grape", "kiwi"};
        // Sort the array in ascending (alphabetical) order
        Arrays.sort(words);
        // Print the sorted array
        System.out.println("Strings in Alphabetical Order:");
        for (String word : words) {
            System.out.println(word);
        }
    }
}
