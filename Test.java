import java.util.Scanner;

class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        for(int i=0;i<number;i++) {
            int x = sc.nextInt();
            int y = sc.nextInt();
            int A = sc.nextInt();
            System.out.println((A >= x && A < y) ? "YES" : "NO" );
        }
    }
}