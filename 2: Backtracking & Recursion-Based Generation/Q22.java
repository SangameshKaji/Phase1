//22. Generate all Binary Strings
import java.util.*;

public class Q22{
    public static ArrayList<String> binstr(int n) {
        ArrayList<String> res = new ArrayList<>();
        backtrack(n, "", res);
        return res;
    }

    public static void backtrack(int n, String curr, ArrayList<String> res) {
        if (curr.length() == n) {
            res.add(curr);
            return;
        }
        backtrack(n, curr + "0", res);
        backtrack(n, curr + "1", res);
    }
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)){
            // int n = sc.nextInt();
            System.out.println(binstr(2));
        }
    }
}
