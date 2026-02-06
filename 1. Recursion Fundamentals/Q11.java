//11. Check whether one string is a subsequence of the other or not using recursion
import java.util.*;
public class Q11 {
    static boolean sub(String s1,String s2,int a,int b){
        if(s2.length() == b) return true;
        if(s1.length() == a) return false;
        if(s1.charAt(a)==s2.charAt(b)){
            return sub(s1,s2,a+1,b+1);
        }
        return sub(s1,s2,a+1,b);
    }
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)){
            String s1 = sc.next();
            String s2 = sc.next();
            if(sub(s1,s2,0,0)){
                System.out.println("Yes");
            }else{
                System.out.println("No");
            }
        }
    }
}
