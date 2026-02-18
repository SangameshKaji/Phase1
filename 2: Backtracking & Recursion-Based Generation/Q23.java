//23. Subsets
import java.util.*;

public class Q23 {
    static List<List<Integer>> subsets(List<Integer> list){
        List<List<Integer>> ans = new ArrayList<>();
        dfs(list,0,new ArrayList<>(),ans);
        return ans;
    }
    static void dfs(List<Integer> list, int s, List<Integer> path, List<List<Integer>> ans){
        if(s == list.size()){
            ans.add(new ArrayList<>(path));
            return;
        }
        path.add(list.get(s));
        dfs(list, s+1, path, ans);

        path.remove(path.size() -1);
        dfs(list, s+1, path, ans);
    }
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)){
            int n  = sc.nextInt();
            List<Integer> list = new ArrayList<>();
            for(int i =0;i<n;i++) list.add(sc.nextInt());
            System.out.println(subsets(list));
        }
    }
}
