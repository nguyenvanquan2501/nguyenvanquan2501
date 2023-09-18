import java.util.Scanner;
public class J01001 {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int dai = sc.nextInt();
        int rong = sc.nextInt();
        if(dai <= 0 || rong <=0){
            System.out.println(0);
        }else{
            System.out.print(2*(dai+rong) + " "+ dai*rong);
        }
    }
}