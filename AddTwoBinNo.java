public class AddTwoBinNo{
    public static void main(String[] args) {
        String binary1 = "1010101",binary2 = "0100110";
        int num1 = Integer.parseInt(binary1, 2);
        int num2 = Integer.parseInt(binary2, 2);
        int sum =num1+num2;
        String Binarysum = Integer.toBinaryString(sum);
        System.out.println("binary1 is:"+binary1);
        System.out.println("binary2 is:"+binary2);
        System.out.println("sum is:"+Binarysum);
    }
}