//18. Find whether target sum is found by sum of few elements within given list using recursion 
import java.util.*;

public class Q18 {
    static boolean sumfound(List<Integer> ls,int t,int idx){
        if(t == 0) return true;
        if(ls.size() == idx) return false;
        if(t<0) return false;
        return sumfound(ls, t, idx+1) || sumfound(ls, t-ls.get(idx), idx+1);
    }
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)){
            List<Integer> ls = new ArrayList<>();
            int n = sc.nextInt();
            for(int i = 0;i<n;i++) ls.add(sc.nextInt());
            int t = sc.nextInt();
            if(sumfound(ls,t,0)){
                System.out.println("Found");
            }else{
                System.out.println("Not found");
            }
        }
    }    
}
