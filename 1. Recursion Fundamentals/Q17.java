//17. Find the total frequency of a target within list using recursion
import java.util.*;

public class Q17 {
    static void totalsum(List<Integer> ls, int t, int idx,int sum){
        if(ls.size() == (idx)){
            System.out.println(sum);
            return;
        }
        if(ls.get(idx) == t){
            sum += 1;
        }
        totalsum(ls, t, idx+1, sum);
    }
    public static void main(String[] args) {
        List<Integer> ls = new ArrayList<>();
        try(Scanner sc = new Scanner(System.in)){
            int n = sc.nextInt();
            for(int i= 0;i<n;i++) ls.add(sc.nextInt());
            int t= sc.nextInt();
            int sum = 0;
            totalsum(ls, t, 0,sum);
        }
    }
}
