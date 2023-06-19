import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class EncodingMessage {

    public static char[] swapCharOfString(String message) {
        char[] messageToArray = message.toCharArray();
        for(int i=0;i<message.length()-1;i=i+2) {
            char temp = messageToArray[i];
            messageToArray[i] = messageToArray[i+1];
            messageToArray[i+1] = temp;
        }
        return messageToArray;
    }

    public static Character hash(char c) {
        Map<Character, Character> map = new HashMap();
        for(int i=97,j=122;i<123&&j>96;i++,j--){
            map.put((char)i,(char)j);
        }
        return map.get(c);
    }

    public static void encoding(String message) {
       char[] convertedMesssage = swapCharOfString(message);
       StringBuilder sb = new StringBuilder();
       for(char c : convertedMesssage) {
         sb.append(hash(c));
       }
       System.out.println(sb);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- != 0) {
            int n = sc.nextInt();
            String message = sc.next();
            encoding(message);
        }
    }
}
