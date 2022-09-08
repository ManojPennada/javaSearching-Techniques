import java.util.Scanner;

public class linearSearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int key = sc.nextInt();
        for (int i = 0; i < n; i++) {
            if (key == arr[i]) {
                System.out.println("Key found at index: " + i);
                return;
            }
        }
        System.out.println("Key Not found");
        return;
    }
}
