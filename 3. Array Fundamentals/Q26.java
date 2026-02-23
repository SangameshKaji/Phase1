//26. Two Sum Problem
import java.util.*;

public class Q26 {
    static int[] ts(int arr[],int n,int target){
        Map<Integer,Integer> map = new HashMap<>();
            for(int i = 0;i<n;i++){
                int compliment = target - arr[i];
                if(map.containsKey(compliment)){
                    return new int[] {map.get(compliment),i};
                }
                map.put(arr[i],i);
            }
            return new int[] {};
        }
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)){
            int n = sc.nextInt();
            int arr[] = new int[n];
            for(int i = 0;i<n;i++) arr[i] = sc.nextInt();
            int target = sc.nextInt();
            System.out.println(Arrays.toString(ts(arr,n,target)));
        }
    }
}
