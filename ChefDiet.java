import java.util.Scanner;

public class ChefDiet {
    public static void calculateProtine(int[] arr, int requirement) {
        int leftOver = 0;
        for(int i=0;i<arr.length;i++) {
            if((leftOver+arr[i]) - requirement >= 0)
                 leftOver = (leftOver+arr[i]) - requirement;
            else{
              System.out.print("NO ");
              System.out.println(i+1);
              return;
            }
        }
        System.out.println("YES");
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- != 0) {
            int n = sc.nextInt();
            int protine = sc.nextInt();
            int[] arr = new int[n];
            for(int i=0;i<n;i++) {
                arr[i] = sc.nextInt();
            }
            calculateProtine(arr, protine);
        }
    }
}
