// Example 1:
// Input:N = 4554
// Output:Palindrome Number
// Explanation: The reverse of 4554 is 4554 and therefore it is palindrome number

import java.util.Scanner;
public class Three{
    public static void P2(int n)
    {   
       int temp = n;
       int rev = 0;
       while (n != 0) {
        int digit = n % 10;
        rev = rev*10 + digit;
        n/=10;
       }
       String res = temp == rev ? "Palindrome Number" : "Not Palidrome";
       System.out.println(res);
    }
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
        // int n = sc.nextInt();
        P2(4554);
        sc.close();
    }
}