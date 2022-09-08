import java.util.*;

public class binarySearch {
    // Make Sure the array is sorted previously
    public static void main(String Args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int key = sc.nextInt();
        int left = 0, right = n - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (key < arr[mid]) {
                right = mid - 1;
            } else if (key > arr[mid]) {
                left = mid + 1;
            } else {
                System.out.println("Key found at index: " + mid);
                return;
            }
        }
        System.out.println("Key Not Found");
        return;
    }
}
