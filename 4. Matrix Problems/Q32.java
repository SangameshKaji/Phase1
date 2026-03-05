//32. Spirally Traversing a Matrix
import java.util.*;

public class Q32 {
    static ArrayList<Integer> spirallyTraverse(int[][] arr) {
        ArrayList<Integer> list = new ArrayList<>();
        int left = 0,top = 0,right = arr[0].length-1,bottom = arr.length-1;
        while(top<=bottom && left<=right){
            for(int i = left;i<=right;i++) list.add(arr[top][i]);
            top++;
            for(int i = top;i<=bottom;i++) list.add(arr[i][right]);
            right--;
            if(top<=bottom){
                for(int i = right;i>=left;i--) list.add(arr[bottom][i]);
                bottom--;
            }
            if(left<=right){
                for(int i = bottom;i>=top;i--) list.add(arr[i][left]);
                left++;
            }
        }
        return list;
    }
        // code here
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)){
            int n = sc.nextInt();
            int m = sc.nextInt();
            int arr[][] = new int[n][m];
            for(int i = 0;i<n;i++){
                for(int j = 0;j<m;j++){
                    arr[i][j] = sc.nextInt();
                }
            }
            System.out.println(spirallyTraverse(arr));
        }
    }    
}
