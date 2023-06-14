import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.concurrent.CountDownLatch;

public class Candy {
    final static String YES = "Yes";
    final static String NO = "No";
    public static String logic(int[] arr) {
        Map<Integer, Integer> map = new HashMap<>();
        if(arr.length % 2 != 0)
          return NO;
        for(int i=0;i<arr.length;i++) {
            if(map.get(arr[i]) == null)
              map.put(arr[i], 1);
            else 
              map.put(arr[i], map.get(arr[i])+1);
        }
        for(int i : map.keySet()) {
            if(map.get(i) > 2)
              return NO;
        }
        return YES; 
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- != 0) {
            int n = sc.nextInt();
            int[] arr = new int[n*2];
            for(int i=0;i<n*2;i++)
              arr[i] = sc.nextInt();
            System.out.println(logic(arr));
        }
    }
}
