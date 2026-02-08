//14. Reverse a number using recursion
import java.util.*;

public class Q14 {
    static void reverse(int n){
        if(n == 0) return;
        System.out.print(n%10);
        reverse(n/10);
    }
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)){
            int n = sc.nextInt();
            reverse(n);
        }
    }    
}
