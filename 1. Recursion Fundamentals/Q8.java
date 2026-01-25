//8. Check whether given string is a palindrome or not using recursion
import java.util.*;

public class Q8 {
    static boolean palindrome(String s, int left, int right){
        if(left >= right) return true;
        if(s.charAt(left) != s.charAt(right)) return false;
        return palindrome(s, left + 1, right - 1);
    }

    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)){
            String s = sc.next();
            if(palindrome(s, 0, s.length() - 1)){
                System.out.println(s + " is palindrome");
            }else{
                System.out.println(s + " is not a palindrome");
            }
        }
    }
}
