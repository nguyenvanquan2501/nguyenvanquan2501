import java.util.*;
public class J01006 {
    public static Scanner sc = new Scanner(System.in);
    public static long fibonaci(long n){
        // if(n == 1 || n == 2){
        //     return 1;
        // }else if (n > 2){
        //     return fibonaci(n-1)+ fibonaci(n-2);
        // }else {
        //     return 0;
        // }
        if(n==1 || n==2){
            return 1;
        }else if(n>2){
            long f1=1;
        long f2=1;
        long fn = 0;
        for(int i = 3;i<=n;i++){
            fn=f1+f2;
            f2=f1;
            f1=fn;
        }
        return fn;
        }else{
            return 0;
        }
        
    }
    public static void test(){
        long n = sc.nextInt();
        System.out.println(fibonaci(n));
    }
    public static void main (String [] args){
        int t = sc.nextInt();
        while(t-->0){
            test();
        }    
    }
}
