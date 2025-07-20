public class anagram{
    public static void main (String[]args){
        String str1 ="shivam";
        String str2 ="mavish";
        str1 = str1.replaceAll("\\s", "").toLowerCase();
        str2 = str2.replaceAll("\\s", "").toLowerCase();
    if(str1.length() != str2.length()){
        System.out.println("Not Anagram");
        return;
    }
     int[] count = new int[26];
        // Pehle string ke characters count karenge
        for (int i = 0; i < str1.length(); i++) {
            count[str1.charAt(i) - 'a']++;
        }
        // Dusri string ke characters subtract karenge
        for (int i = 0; i < str2.length(); i++) {
            count[str2.charAt(i) - 'a']--;
        }
        // Check karenge sab values zero hain ya nahi
        for (int i = 0; i < 26; i++) {
            if (count[i] != 0) {
                System.out.println("Not an anagram");
                return;
            }
        }
        System.out.println("Strings are anagrams!");
 }
}