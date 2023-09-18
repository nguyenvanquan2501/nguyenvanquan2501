import java.util.*;

public class J01010 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt(); // Số bộ test
        sc.nextLine(); // Đọc dòng trống sau số bộ test

        for (int i = 0; i < t; i++) {
            String number = sc.nextLine(); // Đọc số nguyên dương
            String result = cutInHalf(number);
            System.out.println(result);
        }
    }

    public static String cutInHalf(String number) {
        String validDigits = "0189";
        String validPrefix = "18";

        StringBuilder newNumber = new StringBuilder();
        boolean isValid = true;

        for (int i = 0; i < number.length(); i++) {
            char digit = number.charAt(i);
            if (validDigits.indexOf(digit) == -1) {
                isValid = false;
                break;
            }
            if (validPrefix.indexOf(digit) != -1 && i == 0) {
                newNumber.append(digit);
            }
            if (digit == '0') {
                newNumber.append(digit);
            }
        }

        if (!isValid) {
            return "INVALID";
        } else {
            return newNumber.toString();
        }
    }
}
