/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package j03004;

/**
 *
 * @author vanquan
 */
import java.util.*;
public class J03004 {
    public static Scanner sc = new Scanner(System.in);
    public static String nomalizeName(String s){
        if(s.length()==1){
            return s.toUpperCase();
        }
        return s.substring(0,1).toUpperCase()+s.substring(1).toLowerCase();
    }
    public static void test(){
        String s = sc.nextLine();
        String[] words = s.trim().split("\\s+");
        String res = "";
        for(String word : words){
            res+=nomalizeName(word) +" ";
        }
    System.out.println(res);
    }
    public static void main(String[]args){
        int t = sc.nextInt();
        sc.nextLine();
        while(t-->0){
            test();
        }
    }
}
