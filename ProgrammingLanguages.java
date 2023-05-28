import java.util.Scanner;

public class ProgrammingLanguages {
    public static int languageCheck(int[] arr, int x, int y){
       if(arr[0] == x && arr[1] == y || arr[0] == y && arr[1] == x)
         return 1;
       else if(arr[2] == x && arr[3] == y || arr[3] == y && arr[2] == x)
         return 2;
       else return 0;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- != 0) {
            int arr[] = new int[4];
            int x = sc.nextInt();
            int y = sc.nextInt();
            for(int i=0;i<4;i++) {
                arr[i] = sc.nextInt();
            }
            System.out.println(languageCheck(arr, x, y));
        }

    }
}
