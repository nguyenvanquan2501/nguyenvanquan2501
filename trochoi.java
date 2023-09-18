import java.util.*;
// import java.math.BigInteger;
public class trochoi {
    public static Scanner sc = new Scanner(System.in);
    public static void test(){
        int n = sc.nextInt();
        long[] A = new long[n];
        for(int i=0;i<n;i++){
            A[i]= sc.nextInt();
        }
        long sum = 0;
        for(int i=0;i<n;i++){
            sum+=(i+1)*(A[i]+A[i+1]);
        }
        System.out.println(Math.round((sum/(n-1)*1e6)/1e6));
    }
    public static void main(String[]args){
        int t = sc.nextInt();
        while(t-->0){
            test();
        }
    }
}
