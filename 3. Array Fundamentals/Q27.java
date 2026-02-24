//27. Common in 3 sorted arrays
import java.util.*;

public class Q27 {
    static List<Integer> common(List<Integer> arr1, List<Integer> arr2, List<Integer> arr3){
        List<Integer> res = new ArrayList<>();
        int i = 0,j=0,k=0;
        while(i<arr1.size() && j<arr2.size() && k<arr3.size()){
            int a = arr1.get(i);
            int b = arr2.get(j);
            int c = arr3.get(k);

            if(a==b && b==c){
                res.add(a);
                i++;
                j++;
                k++;
            }else if(a<b){
                i++;
            }else if(b<c){
                j++;
            }else{
                k++;
            }
        }
        return res;
    }
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)){
            int n = sc.nextInt();
            List<Integer> arr1 = new ArrayList<>();
            List<Integer> arr2 = new ArrayList<>();
            List<Integer> arr3 = new ArrayList<>();
            for(int i = 0;i<n;i++) arr1.add(sc.nextInt());
            for(int i = 0;i<n;i++) arr2.add(sc.nextInt());
            for(int i = 0;i<n;i++) arr3.add(sc.nextInt());
            System.out.println(common(arr1,arr2,arr3));
        }
    }
}
