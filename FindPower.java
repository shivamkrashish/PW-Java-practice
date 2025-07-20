import java.util.Scanner;
public class FindPower {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("base: ");
        int base = input.nextInt();
        System.out.print("Exponents: ");
        int exponent = input.nextInt();
        long result = 1;
        while (exponent != 0) {
            result *= base;  // Multiply base to result
            exponent--;      // Decrease exponent
        }
        System.out.println("Result: " + result);
    }
}
