/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package j03010;

/**
 *
 * @author vanquan
 */
import java.util.*;
public class J03010 {
    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int n = sc.nextInt();
        sc.nextLine();
        Map<String, Integer> mailCount = new HashMap<>();
        for (int i = 0; i < n; i++) {
            String s = sc.nextLine().toLowerCase().trim();
            String[] words = s.split("\\s+");
            if (words.length == 0) {
                continue; // Skip this iteration if no words are present
            }
            StringBuilder email = new StringBuilder();
            email.append(words[words.length - 1]); // Use the last word for the email
            
            for (int j = 0; j < words.length - 1; j++) {
                if (words[j].length() > 0) { // Check if the word is not empty
                    email.append(words[j].substring(0, 1));
                }
            }
            String emailStr = email.toString();
            if (mailCount.containsKey(emailStr)) {
                int count = mailCount.get(emailStr);
                mailCount.put(emailStr, count + 1);
                emailStr = emailStr + (count + 1);
            } else {
                mailCount.put(emailStr, 1);
            }
            System.out.println(emailStr + "@ptit.edu.vn");
        }
    }
}

