// Example 1:
// Input:N = 153
// Output:True
// Explanation: 13+53+33 = 1 + 125 + 27 = 153

import java.util.Scanner;

public class Fifth {
    public static void P5(int n)
    {
        int temp = n;
        int sum = 0;
       while (n != 0) {
        int digit = n % 10;
        sum += digit*digit*digit;
        n/=10;
       }
       boolean res = (temp == sum);
       System.out.println(res);
    }
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
        // int n = sc.nextInt();
        P5(153);
        sc.close();
    }
}
