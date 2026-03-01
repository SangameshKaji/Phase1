//31. Longest Consecutive Subsequence
import java.util.*;

public class Q31 {
    static int result(int arr[]) {
        if (arr.length == 0)
            return 0;
        HashSet<Integer> set = new HashSet<>();
        for (int n : arr)
            set.add(n);
        int maxLen = 0;

        for (int num : set) {
            if (!set.contains(num - 1)) {
                int curr = num;
                int len = 1;

                while (set.contains(curr + 1)) {
                    curr++;
                    len++;
                }
                maxLen = Math.max(maxLen, len);
            }
        }
        return maxLen;
    }

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt();
            int arr[] = new int[n];
            for (int i = 0; i < n; i++)
                arr[i] = sc.nextInt();
            System.out.println(result(arr));
        }
    }
}
