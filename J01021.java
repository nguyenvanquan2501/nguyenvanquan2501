import java.util.*;

public class J01021 {
    static final long MOD = 1000000007;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            long a = sc.nextLong();
            long b = sc.nextLong();
            if (a == 0 && b == 0) break;
            System.out.println(power(a, b));
        }
    }

    public static long power(long a, long b) {
        if (b == 0) return 1;
        if (b % 2 == 0) {
            long half = power(a, b / 2);
            return (half * half) % MOD;
        } else {
            return (a * power(a, b - 1)) % MOD;
        }
    }
}