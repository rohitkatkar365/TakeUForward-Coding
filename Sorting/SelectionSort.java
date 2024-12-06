import java.util.ArrayList;
import java.util.Scanner;

public class SelectionSort {
    public static void selectSort(ArrayList<Integer> arr, int n) {
        // i = 0 to n-1 (n-1 because of every time we check next element)
        for (int i = 0; i < n - 1; i++) {
            // Assume first element of array is minimum
            int min = i;
            // j = 1 to n (n because of every time we next element of ith element)
            for (int j = i + 1; j < n; j++) {
                // check minimum
                if (arr.get(j) < arr.get(min)) {
                    min = j;
                }
            }
            // Swap logic
            int temp = arr.get(min);
            arr.set(min, arr.get(i));
            arr.set(i, temp);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements:");
        int n = sc.nextInt();
        ArrayList<Integer> arr = new ArrayList<>(n);

        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) {
            int ele = sc.nextInt();
            arr.add(ele);
        }
        selectSort(arr, n);
        System.out.println("ArrayList: " + arr);
        sc.close();
    }
}
