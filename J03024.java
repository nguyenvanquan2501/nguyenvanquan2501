import java.util.Scanner;

public class J03024 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt(); // Số bộ test
        scanner.nextLine(); // Đọc dòng trống

        for (int i = 0; i < t; i++) {
            String s = scanner.nextLine();
            checkNumber(s);
        }
    }

    public static void checkNumber(String s) {
        // Kiểm tra xem chuỗi có phải là số nguyên hợp lệ hay không
        if (!s.matches("[1-9][0-9]*")) {
            System.out.println("INVALID");
            return;
        }

        int evenCount = 0;
        int oddCount = 0;

        for (char c : s.toCharArray()) {
            int digit = c - '0';
            if (digit % 2 == 0) {
                evenCount++;
            } else {
                oddCount++;
            }
        }

        if (s.length() % 2 == 0) {
            // Số chữ số là chẵn
            if (evenCount > oddCount) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        } else {
            // Số chữ số là lẻ
            if (oddCount > evenCount) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}
