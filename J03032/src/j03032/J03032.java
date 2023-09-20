/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package j03032;

/**
 *
 * @author vanquan
 */
import java.util.*;
public class J03032 {

      /**
       * @param args the command line arguments
       */
      public static String Reverse(String s){
            StringBuilder k = new StringBuilder();
            char[] arrays = s.toCharArray();
            for(int i = arrays.length-1;i>=0;i--){
                  k.append(arrays[i]);
            }
            return k.toString();
      }
      public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int t = sc.nextInt();
            sc.nextLine();
            while(t-->0){
                  String[] words = sc.nextLine().split("\\s+");
                  for(String num : words){
                        System.out.print(Reverse(num)+" ");
                  }
                  System.out.println();
            }
      }
      
}
