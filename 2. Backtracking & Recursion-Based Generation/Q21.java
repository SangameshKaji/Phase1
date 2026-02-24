//21. Generate Parentheses
import java.util.*;

public class Q21 {
    static List<String> generateParenthesis(int n) {
        List<String> ans = new ArrayList<>();
        dfs(n,n,new StringBuilder(),ans);
        return ans;
    }
    private static void dfs(int l, int r,StringBuilder sb, List<String> ans){
        if(l==0 && r==0){
            ans.add(sb.toString());
            return;
        }
        if(l>0){
            sb.append("(");
            dfs(l-1, r, sb, ans);
            sb.deleteCharAt(sb.length()-1);
        }
        if(l<r){
            sb.append(")");
            dfs(l, r-1, sb, ans);
            sb.deleteCharAt(sb.length()-1);
        }
    }
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)){
            int n = sc.nextInt();
            System.out.println(generateParenthesis(n));
        }
    }
}
