//13. Find all digits sum of a number using recursion
import java.util.*;
public class Q13 {
    static int sum(int n){
        //n = Math.abs(n);  -- negative numbers
        if(n==0) return 0;
        return (n%10)+ sum(n/10);
    }
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)){
            int n = sc.nextInt();
            int sum = sum(n);
            System.out.println("The sum of digits is "+sum);
        }
    }
}
