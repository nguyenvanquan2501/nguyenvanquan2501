import java.util.*;
public class J01017 {
    public static Scanner sc = new Scanner(System.in);
    public static void test(){
        long n = sc.nextLong(); 
        boolean ok=true;
        while(n>0){
            long k = n%10;
            n/=10;
            long h=n%10;
            if(Math.abs(k-h)!=1){
                ok=false;
                break;
            }
            n/=10;
        }
        if(ok){
            System.out.println("YES");
        }else{
            System.out.println("NO");
        }
    }
    public static void main(String[]args){
        int t = sc.nextInt();
        while(t-->0){
            test();
        }
    }
}
