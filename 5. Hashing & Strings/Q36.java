//36. Valid Anagram
import java.util.*;

public class Q36 {
    static boolean anagram(String s, String t){
        if(s.length() != t.length()) return false;
        int count[] = new int[26];
        for(final char c : s.toCharArray()){
            ++count[c-'a'];
        }

        for(final char c : t.toCharArray()){
            if(count[c-'a']==0){
                return false;
            }else{
                --count[c-'a'];
            }
        }
        return true;
    }
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)){
            String s = sc.nextLine();
            String t = sc.nextLine();
            if(anagram(s,t)){
                System.out.println("They are valid anagram");
            }else{
                System.out.println("Not a valid anagram");
            }
        }
    }
}
