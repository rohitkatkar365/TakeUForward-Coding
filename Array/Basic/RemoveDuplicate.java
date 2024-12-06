import java.util.ArrayList;
import java.util.Scanner;

public class RemoveDuplicate {
    public static int removeDuplicate(ArrayList<Integer> arr, int n) {
        int i = 0;
        for(int j = 1;j<n;j++)
        {
            if (arr.get(i) != arr.get(j)) {
                i+=1;
                int temp = arr.get(i);
                arr.set(i, arr.get(j));
                arr.set(j, temp);
            }
        }
        return i+1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of elements: ");
        int n = sc.nextInt();

        // Handle edge case where n is zero or negative
        if (n <= 0) {
            System.out.println("Invalid input! The list must have at least one element.");
            return;
        }

        ArrayList<Integer> arr = new ArrayList<>();
        System.out.println("Enter the elements:");

        // Populate the ArrayList
        for (int i = 0; i < n; i++) {
            arr.add(sc.nextInt());
        }

        int k = removeDuplicate(arr, n);
        for(int i = 0;i<k;i+=1)
        {
            System.out.println(arr.get(i));
        }
    }
}
