
//28. Rotate an array
import java.util.*;

class Q28 {
    static void rotate(int[] arr, int i, int j) {
        while (j > i) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
    }

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt();
            int arr[] = new int[n];
            for (int i = 0; i < n; i++)
                arr[i] = sc.nextInt();
            int j = sc.nextInt();
            rotate(arr, 0, n - 1);
            rotate(arr, 0, j - 1);
            rotate(arr, j, n - 1);
            for (int i = 0; i < n; i++)
                System.out.print(arr[i] + " ");
        }
    }
}