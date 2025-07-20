public class Bubble_sort {
    public static void main(String[] args) {
        String[] arr = {"banana", "apple", "cherry"};
        int n = arr.length;
        // Bubble Sort logic for string array
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - 1 - i; j++) {
                // Compare adjacent strings using compareTo()
                if (arr[j].compareTo(arr[j + 1]) > 0) {
                    // Swap if arr[j] > arr[j+1]
                    String temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        // Print sorted array
        System.out.println("Sorted string array:");
        for (String word : arr) {
            System.out.println(word);
        }
    }
}