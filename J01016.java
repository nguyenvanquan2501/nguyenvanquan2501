import java.util.*;
public class J01016 {
    public static Scanner sc = new Scanner(System.in);
    public static void test(){
        long n = sc.nextLong();
        int sum = 0;
        while(n>0){
            long k = n%10;
            n/=10;
            if(k==4 || k%10==7){
                sum++;
            }
        }
        if(sum==4 || sum==7){
            System.out.println("YES");
        }else{
            System.out.println("NO");
        }
    }
    public static void main(String[]args){
       
        
            test();
        
    }
}
