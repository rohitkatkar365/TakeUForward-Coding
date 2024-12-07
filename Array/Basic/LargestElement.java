https://wbd.ms/share/v2/aHR0cHM6Ly93aGl0ZWJvYXJkLm1pY3Jvc29mdC5jb20vYXBpL3YxLjAvd2hpdGVib2FyZHMvcmVkZWVtLzM2YTgzZjcxN2RkYzQxYzJhNmJlOGNhNzliZTg2YmY4X0JCQTcxNzYyLTEyRTAtNDJFMS1CMzI0LTVCMTMxRjQyNEUzRF9iNjEwYTM4YS0xYTU0LTRkNDQtOTBkNC0wYzUwZmQ0MGJmMTg=
import java.util.ArrayList;
import java.util.Scanner;

public class LargestElement {
    public static void largest(ArrayList<Integer> arr) {
        // Initialize max with the first element
        int max = arr.get(0);
        
        // Loop through the ArrayList to find the maximum value
        for (int num : arr) {
            if (num > max) {
                max = num;
            }
        }
        
        // Print the largest element
        System.out.println(max);
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

        // Call the largest method
        largest(arr);
    }
}
