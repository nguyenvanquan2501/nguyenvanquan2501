import java.util.*;
public class J02008 {
    public static Scanner sc = new Scanner(System.in);
    public static boolean snt(int n){
        if(n<2){
            return false;
        }else{
            for(int i = 2;i<=Math.sqrt(n);i++){
                if(n%i==0){
                    return false;
                }
            }
        }
        return true;
    }
    public static void test(){
        int n = sc.nextInt();
        long sum = 1;
        for(int i = 2 ;i<=n;i++){
            int k=1;
            if(snt(i)){
                while(Math.pow(i,k)<=n){
                    k++;
                }
                sum*=Math.pow(i,k-1);
            } 
        }
        System.out.println(sum);
    }
    public static void main(String[] args){
        int t = sc.nextInt();
        while(t-->0){
            test();
        }
    }
}
