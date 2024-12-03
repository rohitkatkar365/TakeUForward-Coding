import java.util.Scanner;

public class Eight {
    public static void P8(int n) {
        for (int i = 1; i <= n; i++) {
           for (int j = 1; j <= n; j++) {
            if(j >=i)
            {
                System.out.print("*");
            }
            else{
                System.out.print(" ");
            }
           }
            System.out.println();
        }
    }
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
        // int n = sc.nextInt();
        P8(3);
        sc.close();
    }
}
