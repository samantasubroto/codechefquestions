import java.util.ArrayDeque;
import java.util.Collections;
import java.util.Deque;
import java.util.Scanner;

public class SnakeFest {

    public static String validSnake(String snake) {
      int index = 0;
      for(int i=0;i<snake.length() && i+2 < snake.length();i = i+2) {
         index = i;
         if(snake.charAt(i) == 'H' && snake.charAt(i+1) == 'T')
            continue;
         else
            return "Invalid";
      }
      if(index == snake.length()-1)
        return "Valid";
      else return "Invalid";
      
    }

    public static String snakeCheck(String snake) {
        String INVALID = "invalid";
        String VALID = "valid";
        Deque<Character> stack = new ArrayDeque<>();
        for(int i=0;i<snake.length();i++) {
            char x = snake.charAt(i);
            if(x == 'H') {
                stack.push(snake.charAt(i));
                continue;
            }
            if(stack.isEmpty())
              return INVALID;

            
            if(x == 'T') {
                char c = stack.pop();
                if(c != 'H')
                return INVALID; 
            }  
        }
        return (stack.isEmpty()) ? VALID : INVALID;
    }

    public static String checkSnake(String snake) {
        String INVALID = "invalid";
        String VALID = "valid";
        if(snake.length() == 0) return VALID;
        if(snake.length() % 10 != 0) return INVALID;
        for(int i=0;i<snake.length()/2;i = i+2) {
           int x = snake.charAt(i);
           if(x == 'H' && snake.charAt(i+1) == 'T')
              continue;
            else return INVALID;
        }
        return VALID;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while(t-- != 0) {
            int s = sc.nextInt();
            String snake = sc.next();
            String modifiedString = snake.replaceAll("\\.", "");
            System.out.println(modifiedString);
            System.out.println(checkSnake(modifiedString));
        }
    }
    
}
