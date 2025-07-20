public class Occurence{
public static void main(String[] args) {
    String str ="Shivam Kumar";
    char ch = 'a';
    int count = 0;
    for(int i=0; i<str.length();i++){
        if(str.charAt(i)==ch){
            count++;
        }
    }
    System.out.println("Occurence of "+ch+" in string is: "+count);
   }
}