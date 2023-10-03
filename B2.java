import java.util.*;
import java.math.BigInteger;
public class B2 {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        String num = sc.next();
        while(num.length()>1){
            int halfLength = num.length()/2;
            String left = num.substring(0, halfLength);
            String ringht = num.substring(halfLength);
            BigInteger sum = new BigInteger(left).add(new BigInteger(ringht));
            num = sum.toString();
            System.out.println(sum);
        }

    }
}
