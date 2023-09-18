import java.util.*;
public class J01018 {
    public static Scanner sc = new Scanner(System.in);
    public static void test(){
        long n = sc.nextLong();
        long sum = 0;
        boolean ok=true;
        while(n>0){
            long k = n%10;
            n/=10;
            long h=n%10;
            n/=10;
            sum=sum+h+k;
            if(Math.abs(h-k)!=2){
                ok=false;
                break;
            }
        }
        if(ok && sum%10==0){
            System.out.println("YES");
        }else{
            System.out.println("NO");
        }
    }
    public static void main(String[] args){
        int t = sc.nextInt();
        while(t-->0){
            test();
        }
    }
}
