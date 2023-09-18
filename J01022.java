import java.util.Scanner;

public class J01022 {
    public static Scanner sc = new Scanner(System.in);
    public static long[] fib = new long[93];

    public static void precomputeFibonacci() {
        fib[1] = 1;
        fib[2] = 1;
        for (int i = 3; i < 93; i++) {
            fib[i] = fib[i-1] + fib[i-2];
        }
    }

    public static char findKthCharacter(int n, long k) {
        if (n == 1) return '0';
        if (n == 2) return '1';
        if (k <= fib[n-2]) return findKthCharacter(n-2, k);
        return findKthCharacter(n-1, k - fib[n-2]);
    }

    public static void test() {
        int n = sc.nextInt();
        long k = sc.nextLong();
        System.out.println(findKthCharacter(n, k));
    }

    public static void main(String[] args) {
        precomputeFibonacci();
        int t = sc.nextInt();
        while (t-- > 0) {
            test();
        }
    }
}
