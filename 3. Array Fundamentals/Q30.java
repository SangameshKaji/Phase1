//30. Chocolate Distribution problem
import java.util.*;

public class Q30 {
    static int result(ArrayList<Integer> arr, int m) {
        int res = Integer.MAX_VALUE;
        for (int i = 0; i <= arr.size() - m; i++) {
            res = Math.min(res, arr.get(m + i - 1) - arr.get(i));
        }
        return res;
    }

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt();
            ArrayList<Integer> arr = new ArrayList<>();
            for (int i = 0; i < n; i++)
                arr.add(sc.nextInt());
            Collections.sort(arr);
            int m = sc.nextInt();
            System.out.println(result(arr, m));
        }
    }
}
