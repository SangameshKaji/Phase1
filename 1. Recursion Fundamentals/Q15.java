//15. Find the first occurrence of a target within list using recursion
import java.util.*;

public class Q15 {
    static void printfirst(List<Integer> ls,int t,int idx){
        if(ls.size() == idx){
            System.out.println("-1");
            return;
        }
        if(ls.get(idx) == t){
            System.out.println(idx);
            return;
        }
        printfirst(ls, t, idx+1);
    }
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)){
            int n = sc.nextInt();
            List<Integer> ls = new ArrayList<>();
            for(int i = 0;i<n;i++) ls.add(sc.nextInt());
            int t = sc.nextInt();
            printfirst(ls,t,0);
        }
    }    
}
