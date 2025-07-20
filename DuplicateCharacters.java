public class DuplicateCharacters{
    public static void main(String[] args) {
        String str = "Programming";
        int[]freq = new int[256];
        for(int i=0;i<str.length();i++){
            freq[str.charAt(i)]++;
        }
        for(int i=0;i<256;i++){
            if(freq[i]>1){
                System.err.println((char) i + " : " + freq[i] + " times");
            }
        }
    }

}