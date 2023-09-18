import java.util.Scanner;

public class J01021{
    final static int mod=1000000007;
    public static void main(String[] args){
        int a;
        long b;
        Scanner sc=new Scanner(System.in);
        while(true){
            a=sc.nextInt();
            b=sc.nextLong();
            if(a==0 && b==0){
                break;
            }
            System.out.println(Luy_thua(a, b));
        }
    }

    public static long Luy_thua(int a, long b){
        if(b==0){
            return 1;
        }
        long x=Luy_thua(a, b/2);
        if(b%2==0){
            return (x*x)%mod;
        }else{
            return (a*Luy_thua(a, b-1))%mod;
        }
    }
}

