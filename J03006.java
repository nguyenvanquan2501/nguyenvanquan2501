import java.util.*;
public class J03006 {
    public static Scanner sc = new Scanner(System.in);
    public static boolean ok=true;
    public static String reverseString(String str) {
        StringBuilder reversed = new StringBuilder();
        for (int i = str.length() - 1; i >= 0; i--) {
            reversed.append(str.charAt(i));
            if((int)str.charAt(i)%2!=0){
                ok=false;
            }
        }
        return reversed.toString();
    }
    public static void test(){
        String s = sc.next();
        String s2= reverseString(s);
        boolean d = s.equals(s2);
        if(ok && d){
            System.out.println("YES");
        }else{
            System.out.println("NO");
        }
        ok=true;
    }
    public static void main(String[] args){
        int t = sc.nextInt();
        while(t-->0){
            test();
        }
    }
}
