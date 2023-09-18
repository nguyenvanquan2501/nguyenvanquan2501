import java.util.*;
public class J02106 {
    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args){
        int n = sc.nextInt();
        int m = 3;
        int[][] A = new int[n][m];
        for(int i=0;i<n;i++){
            for(int j = 0;j<m;j++){
                A[i][j]=sc.nextInt();
            }
        }
        int cout = 0;
        for(int i=0;i<n;i++){
            int sum=0;
            for(int j=0;j<m;j++){
                sum+=A[i][j];
            }
            if(sum>1){
                cout++;
            }
        }
        System.out.print(cout);
    }
}
