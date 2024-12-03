// Example 1:
// Input: N = 3
// Output: 
// * * *
// * * *
// * * *
import java.util.*;
public class One {
    public static void P1(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j += 1) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        P1(n);
        sc.close();
    }
}