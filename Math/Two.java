// Example 1:
// Input:N = 12345
// Output:54321

import java.util.Scanner;
public class Two {
    public static void P2(int n)
    {   
       int rev = 0;
       while (n != 0) {
        int digit = n % 10;
        rev = rev*10 + digit;
        n/=10;
       }
       System.out.println(rev);
    }
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
        // int n = sc.nextInt();
        P2(12345);
        sc.close();
    }
}