//2.    Printing from N to 1 
import java.util.*;

public class Q2 {
    static void print(int n){
        if(n == 0) return;
        System.out.println(n);
        print(n - 1);
    }
    public static void main(String[] args){
        try (Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt();
            print(n);
        }
    }
}

