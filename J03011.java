import java.math.BigInteger;
import java.util.*;
public class J03011 {
    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            BigInteger a = sc.nextBigInteger();
            BigInteger b = sc.nextBigInteger();
            BigInteger gcd = a.gcd(b); // Sử dụng phương thức gcd() của BigInteger
            System.out.println(gcd);
        }
    }

}
