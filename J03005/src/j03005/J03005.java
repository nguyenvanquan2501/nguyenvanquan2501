/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package j03005;

/**
 *
 * @author vanquan
 */
import java.util.*;

public class J03005{
    public static Scanner sc = new Scanner(System.in);
    public static String nomalizeLastName(String s){
        if(s.length()==1){
            return s.toUpperCase();
        }
        return s.substring(0,1).toUpperCase()+s.substring(1).toUpperCase();
    }
    public static String nomalizeName(String s){
        if(s.length()==1){
            return s.toUpperCase();
        }
        return s.substring(0,1).toUpperCase()+s.substring(1).toLowerCase();
    }
    public static void test(){
        String s = sc.nextLine();
        String[] words = s.trim().split("\\s+");
        String res = nomalizeLastName(words[0]);
        String res2 = "";
        for(int i = 1;i<words.length;i++){
            res2+=nomalizeName(words[i]);
            if(i!=words.length-1){
                res2+=" ";
            }
        }
        res = res2+", "+res;
        System.out.println(res);
    }
    public static void main(String[]args){
        int t= sc.nextInt();
        sc.nextLine();
        while(t-->0){
            test();
        }
    }
}