//29. Triplet sum in array
import java.util.*;

public class Q29 {
    static boolean triple(int arr[], int target) {
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                for (int k = 0; k < n; k++) {
                    if (i == j || j == k) {
                        continue;
                    }
                    if (arr[i] + arr[j] + arr[k] == target)
                        return true;
                }
            }
        }
        return false;
    }

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt();
            int arr[] = new int[n];
            for (int i = 0; i < n; i++)
                arr[i] = sc.nextInt();
            int target = sc.nextInt();
            System.out.println(triple(arr, target));
        }
    }
}
