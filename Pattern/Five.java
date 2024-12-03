// Input Format: N = 3
// Result: 
// * * *
// * * 
// *
import java.util.Scanner;
public class Five {
    public static void P4(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n-i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // int n = sc.nextInt();
        P4(3);
        sc.close();
    }
}    