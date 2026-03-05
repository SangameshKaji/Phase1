//33. Rotate by 90 Degrees
import java.util.*;

public class Q33 {
    static void rotate(int mat[][]) {
        
    }
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)){
            int n = sc.nextInt();
            int arr[][] = new int[n][n];
            for(int i = 0;i<n;i++){
                for(int j = 0;j<n;i++){
                    arr[i][j] = sc.nextInt();
                }
            }
            rotate(arr);
        }
    }    
}
