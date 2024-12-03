// Example 1:
// Input:N = 12345
// Output:5
import java.util.Scanner;
public class One {
    public static void P1(int n)
    {
        int cnt = 0;
        while(n != 0){
            cnt+=1;
            n/=10;
        }
        System.out.print(cnt);
    }
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
        // int n = sc.nextInt();
        P1(12345);
        sc.close();
    }
}
