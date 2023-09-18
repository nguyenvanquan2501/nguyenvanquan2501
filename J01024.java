import java.util.*;
public class J01024 {
    public static Scanner sc = new Scanner(System.in);
    public static void test(){
        int n = sc.nextInt();
        boolean ok = true;
        while(n>0){
            int k = n%10;
            if(k!=0 && k!=1 && k!=2){
                ok=false;
                break;
            }
            n/=10;
        }
        if(ok){
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
