import java.util.Scanner;

public class LargestStreak {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- != 0) {
            int n = sc.nextInt();
            int max_om = Integer.MIN_VALUE;
            int max_addy = Integer.MIN_VALUE;
            int streakCount = 0;
            for(int i=0;i<n;i++) {
                int value = sc.nextInt();
                if(value != 0)
                  streakCount++;
                else {
                  max_om = Math.max(streakCount, max_om);
                  streakCount = 0;
                }
            }
            max_om = Math.max(streakCount, max_om);
            streakCount = 0;
            for(int i=0;i<n;i++) {
                int value = sc.nextInt();
                if(value != 0)
                  streakCount++;
                else {
                  max_addy = Math.max(streakCount, max_addy);
                  streakCount = 0;
                }
            }
            max_addy = Math.max(streakCount, max_addy);

            //System.out.println(max_om + "  " + max_addy);
            if(max_om > max_addy)
              System.out.println("Om");
            else if(max_addy > max_om)
              System.out.println("Addy");
            else
              System.out.println("Draw");
        }
    }
}
