//9. Check whether 2 strings are same or not using recursion
import java.util.*;

public class Q9 {
    static boolean same(String s1, String s2, int i) {
        if (s1.length() != s2.length()) {
            return false;
        }
        if (i == s1.length()) {
            return true;
        }
        if (s1.charAt(i) != s2.charAt(i)) {
            return false;
        }
        return same(s1, s2, i + 1);
    }

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            String s1 = sc.next();
            String s2 = sc.next();
            if (same(s1, s2, 0)) {
                System.out.println("Both words are same");
            } else {
                System.out.println("Not same");
            }
        }
    }
}