//33. Rotate by 90 Degrees
import java.util.*;

public class Q33 {
    static void rotate(int mat[][]) {
        int n = mat.length;
        int arr[][] = new int[n][n];
        for(int i = 0; i < n; i++){
            arr[i] = mat[i].clone();
        }
        for(int i = 0;i<n;i++){
            for(int j = 0;j<n;j++){
                mat[i][j] = arr[n-1-j][i];
            }
        }
    }
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)){
            int n = sc.nextInt();
            int arr[][] = new int[n][n];
            for(int i = 0;i<n;i++){
                for(int j = 0;j<n;j++){
                    arr[i][j] = sc.nextInt();
                }
            }
            rotate(arr);
            for(int i = 0;i<n;i++){
                for(int j = 0;j<n;j++){
                    System.out.print(arr[i][j]+" ");
                }
                System.out.println();
            }
        }
    }    
}
