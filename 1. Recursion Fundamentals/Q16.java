//16. Find the last occurrence of a target within list using recursion
import java.util.*;

public class Q16 {
    static void printlast(List<Integer> ls,int t,int idx,int i){
        if(ls.size() == idx){
            System.out.println(i);
            return;
        }
        if(ls.get(idx).equals(t)){
            i = idx;
        }
        printlast(ls, t, idx+1,i);
    }
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)){
            int n = sc.nextInt();
            List<Integer> ls = new ArrayList<>();
            for(int i = 0;i<n;i++) ls.add(sc.nextInt());
            int t = sc.nextInt();
            int i = -1;
            printlast(ls,t,0,i);
        }
    }    
}
