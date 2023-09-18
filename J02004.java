import java.util.*;
public class J02004 {
    public static Scanner sc = new Scanner(System.in);
    public static void test(){
        int n = sc.nextInt();
        int[] arr = new int[n+1];
        for(int i=1;i<=n;i++){
            arr[i]=sc.nextInt();
        }
        int [] arr2 = new int[n+1];
        int k=1;
        for(int i=n;i>=1;i--){
            arr2[i]=arr[k];
            k++;
        }
        boolean ok = Arrays.equals(arr,arr2);
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
