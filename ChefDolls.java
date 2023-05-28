import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class ChefDolls {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- != 0) {
            Set<Integer> set = new HashSet<>();
              int n = sc.nextInt();
              while(n-- != 0) {
                int sheDrinks = sc.nextInt();
                if (set.contains(sheDrinks)) {
                    set.remove(sheDrinks);
                } else {
                    set.add(sheDrinks);
                }
              }
          System.out.println(set.iterator().next());
        }
    }
}
