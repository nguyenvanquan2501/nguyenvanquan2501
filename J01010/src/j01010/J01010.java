/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package j01010;

/**
 *
 * @author vanquan
 */
import java.util.Scanner;

public class J01010 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numTestCases = scanner.nextInt();
        
        for (int i = 0; i < numTestCases; i++) {
            String input = scanner.next();
            String result = cutNumber(input);
            System.out.println(result);
        }
    }

    public static String cutNumber(String input) {
        StringBuilder result = new StringBuilder();
        
        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);
            if (c == '9') {
                result.append('0');
            } else if (c == '8' || c == '0') {
                result.append(c);
            } else if (c == '1') {
                result.append('1');
            } else {
                return "INVALID";
            }
        }
        
        while (result.length() > 0 && result.charAt(0) == '0') {
            result.deleteCharAt(0);
        }
        
        return result.toString();
    }
}




