import java.util.*;

public class J03007 {
    public static Scanner sc = new Scanner(System.in);

    public static boolean isBeautifulNumber(String str) {
        int n = str.length();
        if (n == 0 || str.charAt(0) != '8' || str.charAt(n - 1) != '8') {
            return false;
        }

        int sum = 0;
        for (int i = 0; i < n; i++) {
            if (!Character.isDigit(str.charAt(i))) {
                return false;
            }
            sum += Character.getNumericValue(str.charAt(i));
        }

        return sum % 10 == 0;
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
