/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package j03027;

/**
 *
 * @author vanquan
 */
import java.util.*;
public class J03027 {
    public static Scanner sc = new Scanner(System.in);
    public static void main(String[]args){
        String s = sc.nextLine();
        Stack<Character> stk = new Stack<>();
        if (s.length() > 0) {
            stk.push(s.charAt(0));
        }
        for(int i = 1; i < s.length(); i++){
            if(!stk.empty() && stk.peek().equals(s.charAt(i))){
                stk.pop();
            } else {
                stk.push(s.charAt(i));
            }
        }
        if(stk.empty()){
            System.out.println("Empty String");
        } else {
            for(Character num : stk){
                System.out.print(num);
            }
        }
    }
}


