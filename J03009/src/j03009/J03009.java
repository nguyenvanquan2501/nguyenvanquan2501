/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package j03009;

/**
 *
 * @author vanquan
 */
import java.util.HashSet;
import java.util.Scanner;

public class J03009{

    public static Scanner ip = new Scanner(System.in);

    public static void testCase() {
        String[] a = ip.nextLine().split("\\s+");
        String b = ip.nextLine();
        HashSet<String> c = new HashSet<>();
        for (String i : a) {
            if (!b.contains(i)) {
                c.add(i);
            }
        }
        for (String i : c) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int T = Integer.parseInt(ip.nextLine());
        while (T-- > 0) {
            testCase();
        }
    }
}