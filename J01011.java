import java.util.*;
public class J01011{
    public static Scanner sc = new Scanner(System.in);
    public static long rGCD(long a, long b){
        if(b==0){
            return a;
        }else{
            return rGCD(b,a%b);
        }
    }
    public static long rLCM(long a, long b){
        return (a*b)/rGCD(a,b);
    }
    public static void test(){
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println(rLCM(a,b) + " " + rGCD(a,b));
    }
    public static void main(String[] args){
        int t = sc.nextInt();
        while(t-->0){
            test();
        }
    }
}