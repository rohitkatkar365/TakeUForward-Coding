// Input Format: N = 3
// Result: 
//   *  
//   **
//   ***  
//   **
//   *   
import java.util.Scanner;

public class Nine {
    public static void P9(int n)
    {
        for (int i = 0; i < n-1; i++) {
            for (int j = 0; j <=i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <n-i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
        // int n = sc.nextInt();
        P9(3);
        sc.close();
    }
}
