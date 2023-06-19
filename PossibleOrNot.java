import java.util.Scanner;

public class PossibleOrNot {
    public static String match(int[] arr, int key) {
        for(int i=0;i<arr.length;i++) {
            int value = arr[i];
          for(int j=i+1;j<arr.length;j++) {
             if((value&arr[j]) == key) {
               return "YES";
             }
          }
        }
        return "NO";
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- != 0) {
            int n = sc.nextInt();
            int match = sc.nextInt();
            int[] arr = new int[n];
            for(int i=0;i<n;i++) {
                arr[i] = sc.nextInt();
            }
            System.out.println(match(arr,match));
        }
    }
}
