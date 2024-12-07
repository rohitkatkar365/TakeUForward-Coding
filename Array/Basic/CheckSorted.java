https://wbd.ms/share/v2/aHR0cHM6Ly93aGl0ZWJvYXJkLm1pY3Jvc29mdC5jb20vYXBpL3YxLjAvd2hpdGVib2FyZHMvcmVkZWVtLzE2NTQzYTRlMWViNTQ4MmJhODczZTE2ZTQ2M2E5NzM5X0JCQTcxNzYyLTEyRTAtNDJFMS1CMzI0LTVCMTMxRjQyNEUzRF83MTRjODdhYS1kZmI2LTRlZDItOGNmMi0yMDc1MmIyMjMzMjU=
import java.util.ArrayList;
import java.util.Scanner;

public class CheckSorted {
    public static boolean checkSort(ArrayList<Integer> arr) {
        // Check if the list is sorted in ascending order
        for (int i = 0; i < arr.size() - 1; i++) {
            if (arr.get(i) > arr.get(i + 1)) {
                return false; // List is not sorted
            }
        }
        return true; // List is sorted
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

        // Call the checkSort method
        System.out.println(checkSort(arr)); // Output whether the list is sorted
    }
}
