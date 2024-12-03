// Find GCD of two numbers
// Example 1:
// Input:N1 = 9, N2 = 12        
// Output:3

import java.util.Scanner;

public class Four {
    public static void P4(int a,int b)
    {
        while (a>0 && b>0) {
            if (a > b) {
                a= a % b;
            }
            else{
                b = b % a;
            }
        }
        if (a==0) {
            System.out.println(b);
            return;
        }
        System.out.println(a);
        return;
    }
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
        // int n = sc.nextInt();
        P4(9,12);
        sc.close();
    }
}
