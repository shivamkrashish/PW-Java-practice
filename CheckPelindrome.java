// Check Palindrome String using Stack,Queue, For, and While loop: 
import java.util.*;
public class CheckPelindrome{
    public static void main(String[] args) {
        String str="madam";
        str.toLowerCase().replaceAll(" ", "");
        Stack<Character>stack = new Stack<>();
        Queue<Character> queue = new LinkedList<>();
        for (int i = 0; i < str.length(); i++) {
        char ch = str.charAt(i);
        stack.push(ch);      
        queue.offer(ch);     
        }
        boolean isPelindrome = true;
        while(!stack.isEmpty() && !queue.isEmpty()){
            if(stack.pop() != queue.poll()){
                isPelindrome = false;
                break;
            }
        }
        if(isPelindrome){
            System.out.println("Pelindrome");
        }else{
            System.out.println(" Not Pelindrome");
        }
    }

}