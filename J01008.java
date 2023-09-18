import java.util.*;
public class J01008 {
    public static Scanner sc = new Scanner(System.in);
    public static int k = 1;
    public static void test(){
        int n = sc.nextInt();
        System.out.print("Test "+k+": ");
        int x = 0;
        for(int i = 2;i<=n;i++){
            if(n%i==0){
                while(n%i==0){
                    x++;
                    n=n/i;
                }
                System.out.print(i+"("+x+") ");
                x=0;
            }
        }
        System.out.println();
    }

    public static void main(String [] args){
        int t = sc.nextInt();
        while(t-->0){
            test();
            k++;
        }
    }
}
