import java.util.ArrayList; // Importing ArrayList for dynamic array operations
import java.util.Scanner;   // Importing Scanner for taking user input

public class InsertionSort {
    // Method to perform insertion sort on an ArrayList
    public static void insertSort(ArrayList<Integer> arr, int n) {
        for (int i = 0; i <= arr.size() - 1; i++) { // Outer loop for iterating over each element
            int j = i;
            // Inner loop to place the current element in the correct position
            while (j > 0 && arr.get(j - 1) > arr.get(j)) {
                // Swap the elements if they are out of order
                int temp = arr.get(j);
                arr.set(j, arr.get(j - 1));
                arr.set(j - 1, temp);
                j -= 1; // Move the pointer to the left
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // Creating a Scanner object for user input
        System.out.println("Enter the number of elements:"); // Prompt for number of elements
        int n = sc.nextInt(); // Read the number of elements
        ArrayList<Integer> arr = new ArrayList<>(n); // Initialize ArrayList with capacity 'n'

        System.out.println("Enter " + n + " elements:"); // Prompt for array elements
        for (int i = 0; i < n; i++) {
            int ele = sc.nextInt(); // Read each element from user
            arr.add(ele); // Add the element to the ArrayList
        }

        // Call the insertion sort method
        insertSort(arr, n);

        // Print the sorted ArrayList
        System.out.println("ArrayList: " + arr);

        sc.close(); // Close the scanner to release resources
    }
}
