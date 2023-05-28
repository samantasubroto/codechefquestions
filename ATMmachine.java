import java.util.Scanner;

public class ATMmachine {
    public static boolean avabalityCheck(int available, int withdrwal) {
       return available >= withdrwal ? true : false;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- != 0) {
            int n = sc.nextInt();
            int availableBalance = sc.nextInt();
            for(int i=0;i<n;i++){
                int toWithDrawal = sc.nextInt();
                if(avabalityCheck(availableBalance, toWithDrawal)) {
                   availableBalance -= toWithDrawal;
                   System.out.print(1);
                }else 
                System.out.print(0);
            }
        }

    }
}