import java.util.ArrayList;
import java.util.Scanner;

public class SecondLargest {
    public static void slargest(ArrayList<Integer> arr) {
        int large = Integer.MIN_VALUE;
        int slarge = Integer.MIN_VALUE;

        // Loop through the ArrayList to find the largest and second largest
        for (int num : arr) {
            if (num > large) {
                slarge = large; // Update second largest
                large = num;    // Update largest
            } else if (num > slarge && num != large) {
                slarge = num; // Update second largest if distinct
            }
        }

        // Check if a valid second largest exists
        if (slarge == Integer.MIN_VALUE) {
            System.out.println("No distinct second largest element found.");
        } else {
            System.out.println("Second largest element: " + slarge);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of elements: ");
        int n = sc.nextInt();

        // Handle edge case where n is less than 2
        if (n < 2) {
            System.out.println("Invalid input! The list must have at least two elements.");
            return;
        }

        ArrayList<Integer> arr = new ArrayList<>();
        System.out.println("Enter the elements:");

        // Populate the ArrayList
        for (int i = 0; i < n; i++) {
            arr.add(sc.nextInt());
        }

        // Call the second largest method
        slargest(arr);
    }
}
