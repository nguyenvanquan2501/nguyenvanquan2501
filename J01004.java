import java.util.*;
public class J01004 {
    public static Scanner sc = new Scanner(System.in);
    public static int snt(int n){
        if(n<=1){
            return 0;
        }else{
            for(int i= 2 ;i <= Math.sqrt(n);i++){
                if(n%i==0){
                    return 0;
                }
            }
        }
        return 1; 
    }

    public static void test(){
        int n = sc.nextInt();
            if(snt(n)==1){
                System.out.println("YES");
            }else{
                System.out.println("NO");
            }
    }
    public static void main(String [] args){
        int t = sc.nextInt();
        while(t-->0){
            test();
        }
    }
}
