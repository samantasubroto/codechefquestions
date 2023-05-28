import java.util.Scanner;

public class EasyPronunciation {

    public static boolean isStringVowel(String s) {
        boolean isVowel  = false;
        for(int i=0;i<s.length();i++) {
            if(isVowel(s.charAt(i)))
              isVowel = true;
        }
        return isVowel;
    }

    public static boolean isVowel(char c) {
        return "AEIOUaeiou".indexOf(c) != -1;
      }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        while(n--!=0){
            boolean isTrue = true;
           int length = sc.nextInt();
           String word = "";
           while( length-- != 0){
              if(sc.hasNext())
              word += sc.next().charAt(0);     
           } 
           for(int i=0;i<word.length() && i+4 < word.length(); i=i+4) {
              if(!isStringVowel(word.substring(i, i+4))) {
                isTrue = false;
              }
           }
              System.out.println(isTrue);
        }
    }
}
