import java.util.*;
public class J02103 {
    public static Scanner sc = new Scanner(System.in);
    public static int n;
    public static int m;
    public static int k = 1;
    public static void in(int[][] matrix){
        for(int i=0;i<n;i++){
            for(int j=0; j<n;j++){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static void tichmatrix(int[][] a, int [][] b){
        int[][] c = new int[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                c[i][j]=0;
                for(int k = 0;k<m;k++){
                    c[i][j]+=a[i][k]*b[k][j];
                }
            }
        }
        in(c);
    }
    public static void test(){
        n = sc.nextInt();
        m = sc.nextInt();
        int[][] matrixA = new int[n][m];
        int[][] matrixB = new int[m][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                matrixA[i][j] = sc.nextInt();
                matrixB[j][i] = matrixA[i][j];
            }
        }
        System.out.println("Test "+ k+":");
        tichmatrix(matrixA, matrixB);
        k++;
    }
    public static void main(String[] args){
        int t = sc.nextInt();
        while(t-->0){
            test();
        }
    }
}
