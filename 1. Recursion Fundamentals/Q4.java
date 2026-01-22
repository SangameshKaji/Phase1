//4.    Printing List using recursion (Both from Left to Right, as well as Right to Left)
import java.util.*;

public class Q4 {
    static void printleft(int num[],int n){
        if(n == -1) return;
        System.out.println(num[n]);
        printleft(num, n-1);
    }
    static void printright(int num[], int n){
        if(n == -1) return;
        printright(num, n-1);
        System.out.println(num[n]);
    }
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)){
        var n = sc.nextInt();
        int num[] = new int[n];
        for(int i =0;i<n;i++) num[i] = sc.nextInt();
        printleft(num,n-1);
        printright(num,n-1);
        }
    }
}
