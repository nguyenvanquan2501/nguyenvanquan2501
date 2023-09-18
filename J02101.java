import java.util.*;
public class J02101 {
    public static Scanner sc = new Scanner(System.in);
    public static void test(){
        int n = sc.nextInt();
        int[][] arr = new int[200][200];
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){
                arr[i][j]=sc.nextInt();
            }
        }
        int l=1;
        for(int i = 1;i<=n;i++){
            if(l==1){
                for(int j=1;j<=n;j++){
                    System.out.print(arr[i][j]+" ");
                    l++;
                }
                l=n;
            }else if(l==n){
                for(int j=n;j>=1;j--){
                    System.out.print(arr[i][j]+ " ");
                    l--;
                }
                l=1;
            }
        }
        System.out.println();
    }
    public static void main(String[] args){
        int t=sc.nextInt();
        while(t-->0){
            test();
        }
    }
}
