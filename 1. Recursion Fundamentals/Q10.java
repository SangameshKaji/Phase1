//10. Check whether one string is a substring of the other or not using recursion
import java.util.*;
public class Q10 {

    static boolean check(String s1, String s2) {
        if (s1.length() > s2.length())
            return false;
        if (startsWith(s1, s2))
            return true;
        return check(s1, s2.substring(1));
    }

    static boolean startsWith(String s1, String s2) {
        if (s1.length() == 0)
            return true;
        if (s2.length() == 0)
            return false;
        if (s1.charAt(0) != s2.charAt(0))
            return false;
        return startsWith(s1.substring(1), s2.substring(1));
    }

    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)){
            String s1 = sc.next();
            String s2 = sc.next();

            if (check(s1, s2))
                System.out.println(s1 + " is substring of " + s2);
            else
                System.out.println(s1 + " is not a substring of " + s2);
        }
    }
}