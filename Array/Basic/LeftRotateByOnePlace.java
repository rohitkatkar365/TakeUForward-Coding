import java.util.ArrayList;
import java.util.Scanner;

public class LeftRotateByOnePlace {
    public static void leftOne(ArrayList<Integer> arr) {
        if (arr == null || arr.isEmpty()) {
            System.out.println("Array is empty!");
            return;
        }
        
        int temp = arr.get(0);  // Store the first element
        for (int i = 1; i < arr.size(); i++) {
            arr.set(i - 1, arr.get(i));  // Shift elements left
        }
        arr.set(arr.size() - 1, temp);  // Place the first element at the end
        System.out.println(arr);  // Print the rotated array
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

        // Perform the left rotation by one place
        leftOne(arr);
    }
}
