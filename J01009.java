import java.util.*;
public class J01009 {
    public static Scanner sc = new Scanner(System.in);
    public static long giaithua(int n){
        long sum=1;
        for(int i = 1;i<=n;i++){
            sum*=i;
        }
        return sum;
    }
    public static void main(String [] args){
        int n = sc.nextInt();
        long sum = 0;
        for(int i = 1 ;i<=n;i++){
            sum+=giaithua(i);
        }
        System.out.print(sum);
    }
}
