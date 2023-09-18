/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package j02014;

/**
 *
 * @author vanquan
 */
import java.util.*;
public class J02014 {
    public static Scanner sc =new Scanner(System.in);
    public static void main(String[]args){
        int t = sc.nextInt();
        sc.nextLine();
        while(t-->0){
            int n = sc.nextInt();
            sc.nextLine();
            int[] array = new int[n];
            int sumtotal =0;
            for(int i=0;i<n;i++){
           
                array[i] = sc.nextInt();
                sumtotal+=array[i];
            }
            int k =0;
            int suml=0;
            for(int i = 1;i<n-1;i++){
                suml+=array[i-1];
                sumtotal-=array[i];
                if(sumtotal/2==suml){
                    k=i+1;
                    break;
                }
                sumtotal+=array[i];
            }
            if(k!=0){
                System.out.println(k);
            }else{
                System.out.println(-1);
            }
        }
    }
}
