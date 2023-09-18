import java.util.*;
public class J02105 {
    public static Scanner sc = new Scanner(System.in);
    public static int k=1;
    public static void main(String[] args){
        int n = sc.nextInt();
        int[][] G = new int[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                G[i][j]= sc.nextInt();
            }
        }
        for(int i=0;i<n;i++){
            System.out.print("List("+k+") = ");
            for(int j=0;j<n;j++){
                if(G[i][j]==1){
                    System.out.print(j+1+" ");
                }
            }
            System.out.println();
            k++;
        }
    }
}
