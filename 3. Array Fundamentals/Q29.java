//29. Triplet sum in array
import java.util.*;

public class Q29 {
    static boolean triple(int arr[], int target) {
        int n = arr.length;
        Arrays.sort(arr);

        for (int i = 0; i < n - 2; i++) {
            int left = i + 1;
            int right = n - 1;

            while (left < right) {
                int sum = arr[i] + arr[left] + arr[right];

                if (sum == target)
                    return true;
                else if (sum < target)
                    left++;
                else
                    right--;
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

// If asked all the unique combinations
// import java.util.*;

// public class Q29 {

// static List<List<Integer>> triple(int arr[], int target) {
// List<List<Integer>> result = new ArrayList<>();
// int n = arr.length;
// Arrays.sort(arr);

// for (int i = 0; i < n - 2; i++) {

// if (i > 0 && arr[i] == arr[i - 1])
// continue;

// int left = i + 1;
// int right = n - 1;

// while (left < right) {

// int sum = arr[i] + arr[left] + arr[right];

// if (sum == target) {

// result.add(Arrays.asList(arr[i], arr[left], arr[right]));

// left++;
// right--;

// while (left < right && arr[left] == arr[left - 1])
// left++;

// while (left < right && arr[right] == arr[right + 1])
// right--;

// } else if (sum < target) {
// left++;
// } else {
// right--;
// }
// }
// }
// return result;
// }

// public static void main(String[] args) {
// Scanner sc = new Scanner(System.in);

// int n = sc.nextInt();
// int arr[] = new int[n];

// for (int i = 0; i < n; i++)
// arr[i] = sc.nextInt();

// int target = sc.nextInt();

// System.out.println(triple(arr, target));
// }
// }