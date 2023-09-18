import java.util.*;
import java.math.BigInteger;
public class J03033 {
    public static Scanner sc = new Scanner(System.in);
    public static void test(){
        BigInteger a = sc.nextBigInteger();
        BigInteger b = sc.nextBigInteger();
        System.out.println(a.multiply(b).divide(a.gcd(b)));
    }
    public static void main(String[] args){
        int t = sc.nextInt();
        while(t-->0){
            test();
        }
    }
}
