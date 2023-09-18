/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package j03015;

/**
 *
 * @author vanquan
 */
import java.math.BigInteger;
import java.util.Scanner;

public class J03015 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BigInteger A = sc.nextBigInteger();
        BigInteger B = sc.nextBigInteger();
        BigInteger C = A.subtract(B);
        System.out.println(C.toString());
    }
}
