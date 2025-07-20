public class ConvertchartoStringandStringtoChar {
    public static void main(String[] args) {
        char ch = 'A';
        String str = Character.toString(ch);
        System.out.println("char to String: "+str);
        String s = "Hello";
        char c = s.charAt(0);
        System.out.println("String to char: "+c);
    }
}