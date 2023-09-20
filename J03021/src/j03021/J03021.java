
package j03021;

import java.util.*;


public class J03021 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine(); // Đọc dòng trống
        while (t-- > 0) {
            String message = sc.nextLine();
            String number = convertToNumber(message);
            System.out.println(isPalindrome(number) ? "YES" : "NO");
        }
    }

    public static String convertToNumber(String message) {
        StringBuilder sb = new StringBuilder();
        for (char c : message.toLowerCase().toCharArray()) {
            if (c >= 'a' && c <= 'c') {
                sb.append('2');
            } else if (c >= 'd' && c <= 'f') {
                sb.append('3');
            } else if (c >= 'g' && c <= 'i') {
                sb.append('4');
            } else if (c >= 'j' && c <= 'l') {
                sb.append('5');
            } else if (c >= 'm' && c <= 'o') {
                sb.append('6');
            } else if (c >= 'p' && c <= 's') {
                sb.append('7');
            } else if (c >= 't' && c <= 'v') {
                sb.append('8');
            } else if (c >= 'w' && c <= 'z') {
                sb.append('9');
            }
        }
        return sb.toString();
    }

    public static boolean isPalindrome(String str) {
        int n = str.length();
        for (int i = 0; i < n / 2; i++) {
            if (str.charAt(i) != str.charAt(n - i - 1)) {
                return false;
            }
        }
        return true;
    }
}

