// Input Format: N = 3
// Result: 
// * 
// * * 
// * * *

import java.util.Scanner;

public class Two {
    public static void P2(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        P2(n);
        sc.close();
    }
}
