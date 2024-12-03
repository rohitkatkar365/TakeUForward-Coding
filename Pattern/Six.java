// Input Format: N = 3
// Result: 
// 1 2 3
// 1 2
// 1
import java.util.Scanner;
public class Six {
    public static void P6(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        P6(n);
        sc.close();
    }
}    