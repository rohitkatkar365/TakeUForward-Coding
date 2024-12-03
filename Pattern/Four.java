
// Input Format: N = 3
// Result: 
// 1
// 2 2 
// 3 3 3
import java.util.Scanner;

public class Four {
    public static void P4(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        P4(n);
        sc.close();
    }
}    