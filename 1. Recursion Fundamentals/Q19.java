//19. Print all possible subsets of a given list using recursion 
import java.util.*;

public class Q19 {
    static void printSubsets(List<Integer> list,int idx,ArrayList<Integer> curr){
        if(list.size()==idx){
            System.out.println(curr);
            return;
        }
        curr.add(list.get(idx));
        printSubsets(list, idx+1, curr);
        curr.remove(curr.size()-1);
        printSubsets(list, idx+1, curr);
    }
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)){
            List<Integer> ls = new ArrayList<>();
            int n = sc.nextInt();
            for(int i = 0;i<n;i++) ls.add(sc.nextInt());
            printSubsets(ls,0,new ArrayList<>());
        }
    }
}
