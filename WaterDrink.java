import java.util.Scanner;

public class WaterDrink {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t--!=0){
           int sheDrinks = sc.nextInt();
           System.out.println(sheDrinks >= 2000 ? "YES" : "NO");
        }
    }
}
