//12. Print 2-D matrix using recursion, starting from (0, 0) indices till (m - 1, n - 1) indices 
import java.util.*;

public class Q12 {
    static void printMatrix(int mat[][],int r, int c, int a, int b){
        if(r == a) return;
        if(c == b){
            System.out.println();
            printMatrix(mat, r, c, a+1, 0);
            return;
        }
        System.out.print(mat[a][b]+" ");
        printMatrix(mat, r, c, a, b+1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int r = sc.nextInt();
        int c = sc.nextInt();

        int[][] mat = new int[r][c];

        for (int i = 0; i < r; i++)
            for (int j = 0; j < c; j++)
                mat[i][j] = sc.nextInt();

        printMatrix(mat, r,c,0,0);
    }
}
