/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package j03025;

/**
 *
 * @author vanquan
 */
import java.util.*;
public class J03025 {

      /**
       * @param args the command line arguments
       */
      public static boolean Test(String s){
            //StringBuilder k = new StringBuilder();
            char[] charArray1 = s.toCharArray();
            char[] charArray2 = s.toCharArray();
            int sum=0;
            int n = s.length();
            for(int i=0;i<n/2;i++){
                  if(charArray1[i]!=charArray2[n-i-1]){
                        sum+=1;
                  }
            }
            if(sum==1){
                  return true;
            }else if(sum>1){
                  return false;
            }else{
                  if(n%2!=0){
                        return true;
                  }
            }
            return false;
      }
      public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int t = sc.nextInt();
            sc.nextLine();
            while(t-->0){
                  String s = sc.nextLine();
                  if(Test(s)){
                        System.out.println("YES");
                  }else{
                        System.out.println("NO");
                  }
            }
      }
      
}
