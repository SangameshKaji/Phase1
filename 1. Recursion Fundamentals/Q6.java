//6. Finding Minimum and Maximum Values within a list using recursion
import java.util.*;

public class Q6 {

    static int[] maxmin(int[] nums, int n) {
        if (n == 0) {
            return new int[]{nums[0], nums[0]};
        }

        int[] result = maxmin(nums, n - 1);

        int max = Math.max(result[0], nums[n]);
        int min = Math.min(result[1], nums[n]);

        return new int[]{max, min};
    }

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt();
            int[] nums = new int[n];
            for (int i = 0; i < n; i++) nums[i] = sc.nextInt();

            int[] ans = maxmin(nums, n - 1);

            System.out.println("Maximum : " + ans[0]);
            System.out.println("Minimum : " + ans[1]);
        }
    }
}