https://takeuforward.org/data-structure/merge-sort-algorithm/
import java.util.ArrayList;
import java.util.Scanner;

public class MergeSort {
    public static void mergeSort(ArrayList<Integer> arr, int l, int e) {
        if (l >= e) {
            return;
        }

        int mid = (l + e) / 2;

        // Recursive calls to sort left and right halves
        mergeSort(arr, l, mid);
        mergeSort(arr, mid + 1, e);

        // Merge the sorted halves
        merge(arr, l, mid, e);
    }

    public static void merge(ArrayList<Integer> arr, int l, int mid, int e) {
        ArrayList<Integer> temp = new ArrayList<>();

        int left = l;      // Start of the left half
        int right = mid + 1; // Start of the right half

        // Merge elements into the temporary list in sorted order
        while (left <= mid && right <= e) {
            if (arr.get(left) <= arr.get(right)) {
                temp.add(arr.get(left));
                left++;
            } else {
                temp.add(arr.get(right));
                right++;
            }
        }

        // Copy remaining elements from the left half
        while (left <= mid) {
            temp.add(arr.get(left));
            left++;
        }

        // Copy remaining elements from the right half
        while (right <= e) {
            temp.add(arr.get(right));
            right++;
        }

        // Copy the sorted elements back to the original array
        for (int i = 0; i < temp.size(); i++) {
            arr.set(l + i, temp.get(i));
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

        // Perform Merge Sort
        mergeSort(arr, 0, n - 1);

        System.out.println("Sorted ArrayList: " + arr);
        sc.close();
    }
}
