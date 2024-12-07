https://wbd.ms/share/v2/aHR0cHM6Ly93aGl0ZWJvYXJkLm1pY3Jvc29mdC5jb20vYXBpL3YxLjAvd2hpdGVib2FyZHMvcmVkZWVtLzhhOGYyNTBkZjM1ZTQzMmFiMGFkMDFlNDc1ODMxNzcxX0JCQTcxNzYyLTEyRTAtNDJFMS1CMzI0LTVCMTMxRjQyNEUzRF9kYWMxNjRlYS0wMjVhLTRjNzAtYTA2OS1hNTc5Yzk0YTcxNGY=
import java.util.ArrayList;
import java.util.Scanner;

public class BubbleSort {
    public static void bubbleSort(ArrayList<Integer> arr, int n) {
        for (int i = 0; i < n - 1; i++) {
            // at the end of loop largest element set at nth position
            for (int j = 0; j < n - i - 1; j++) {
                // check maximum number
                if (arr.get(j) > arr.get(j + 1)) {
                    // Swap logic
                    int temp = arr.get(j);
                    arr.set(j, arr.get(j + 1));
                    arr.set(j + 1, temp);
                }
            }
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

        bubbleSort(arr, n);
        System.out.println("Sorted ArrayList: " + arr);
        sc.close();
    }
}
