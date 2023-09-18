import java.util.*;

public class J01014 {
    public static Scanner sc = new Scanner(System.in);

    public static boolean isPrime(long n) {
        if (n <= 1) return false;
        if (n <= 3) return true;
        if (n % 2 == 0 || n % 3 == 0) return false;
        long i = 5;
        while (i * i <= n) {
            if (n % i == 0 || n % (i + 2) == 0) return false;
            i += 6;
        }
        return true;
    }

    public static void test() {
        long n = sc.nextLong();
        long max = 0;
        while (n % 2 == 0) {
            max = 2;
            n /= 2;
        }
        for (long i = 3; i <= Math.sqrt(n); i += 2) {
            while (n % i == 0) {
                max = i;
                n /= i;
            }
        }
        if (n > 2) {
            max = n;
        }
        System.out.println(max);
    }

    public static void main(String[] args) {
        int t = sc.nextInt();
        while (t-- > 0) {
            test();
        }
    }
}
