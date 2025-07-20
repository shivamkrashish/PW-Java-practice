public class ReverseWords {
    public static void main(String[] args) {
        String sentence = "Shivam is a gentlement";
        // Step 1: Split the sentence into words
        String[] words = sentence.split(" ");
        // Step 2: Reverse the array of words
        System.out.println("Reversed Words in the String:");
        for (int i = words.length - 1; i >= 0; i--) {
            System.out.print(words[i] + " ");
        }
    }
}
