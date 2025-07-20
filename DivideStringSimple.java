public class DivideStringSimple {
    public static void main(String[] args) {
        String str = "abcdefghi";
        int n = 3;

        int len = str.length();

        // Check if string can be divided equally
        if (len % n != 0) {
            System.out.println("Cannot divide string into equal parts.");
            return;
        }

        int partSize = len / n;

        for (int i = 0; i < len; i += partSize) {
            String part = str.substring(i, i + partSize);
            System.out.println(part);
        }
    }
}