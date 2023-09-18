import java.util.*;
import java.math.BigInteger;
public class J03039 {
    public static Scanner sc = new Scanner(System.in);
    public static void test(){
        BigInteger a = sc.nextBigInteger();
        BigInteger b = sc.nextBigInteger();
        boolean k = a.mod(b).equals(BigInteger.ZERO);
        boolean k2 = b.mod(a).equals(BigInteger.ZERO);
        if(k || k2){
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
