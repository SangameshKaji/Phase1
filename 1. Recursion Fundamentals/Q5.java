//5.    Finding Sum of list of integers using recursion 
import java.util.*;

public class Q5 {
    static int sum(int nums[], int n) {
        if (n < 0) return 0;
        return nums[n] + sum(nums, n - 1);
    }

    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)){
        int n = sc.nextInt();
        int nums[] = new int[n];
        for (int i = 0; i < n; i++) nums[i] = sc.nextInt();
        System.out.println(sum(nums, n - 1));
        }
    }
}