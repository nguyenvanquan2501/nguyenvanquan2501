import java.util.*;

public class J03008 {
    public static Scanner sc = new Scanner(System.in);

    public static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static boolean isBeautifulNumber(String str) {
        int n = str.length();
        for (int i = 0; i < n / 2; i++) {
            if (str.charAt(i) != str.charAt(n - i - 1)) {
                return false;
            }
            int digit = Character.getNumericValue(str.charAt(i));
            if (!isPrime(digit)) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int t = sc.nextInt();
        sc.nextLine(); // Clear the newline after the integer input
        while (t-- > 0) {
            String number = sc.nextLine();
            if (isBeautifulNumber(number)) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}
