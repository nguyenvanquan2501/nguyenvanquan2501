/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package j07002;

/**
 *
 * @author vanquan
 */
import java.io.*;
import java.util.*;

public class J07002 {
    public static void main(String[]args) throws FileNotFoundException{
        File file = new File("DATA.txt");
        Scanner sc = new Scanner(file);
        long sum=0;
        while(sc.hasNext()){
            String s = sc.next();
            try {
                sum+=Integer.parseInt(s);
            } catch (Exception e) {
                // TODO: handle exception
            }
        }
        System.out.println(sum);
    }    
}
