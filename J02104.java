import java.util.*;
public class J02104 {
    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args){
        int n = sc.nextInt();
        int[][] G = new int[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                G[i][j]=sc.nextInt();
            }
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(G[i][j]==1 && j>i){
                    System.out.println("("+(i+1)+","+(j+1)+")");
                }
            }
        }
    }

}
