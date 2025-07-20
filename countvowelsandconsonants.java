public class countvowelsandconsonants{
    public static void main(String[] args) {
        String str = "shivam";
        int countvowel = 0;
        int countconsonants = 0;
        for(int i=0; i<str.length();i++){
            char ch =str.charAt(i);
            if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'){
                countvowel++;
            }else{
                countconsonants++;
            }
        }
        System.out.println("Count vowels is:"+countvowel);
        System.out.println("Count Consonents is:"+countconsonants);
    }
}