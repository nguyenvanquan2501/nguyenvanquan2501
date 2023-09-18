import java.util.*;
public class J01026 {
    public static Scanner sc = new Scanner(System.in);
    public static void test(){
        int n = sc.nextInt();
        int k = (int)Math.sqrt(n);
        if(n==k*k){
            System.out.println("YES");
        }else{
            System.out.println("NO");
        }
    }
    public static void main(String[]args){
        int t = sc.nextInt();
        while(t-->0){
            test();
        }
    }
}
