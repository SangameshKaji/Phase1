//3.    Printing Even numbers from 1 to N 
import java.util.*;

public class Q3{
    static void print(int n){
        if(n == 0) return;
        print(n-2);
        System.out.println(n);
    }
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)){
            int n = sc.nextInt();
            if(n%2!=0) n-=1;
            print(n);
        }
    }
}