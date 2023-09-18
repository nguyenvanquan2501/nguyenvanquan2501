import java.util.*;
import java.lang.Math.*;
class fraction{
    private long numerator, denominator;
    public fraction(long numerator, long denominator){
        this.numerator=numerator;
        this.denominator=denominator;   
    }
    public void setnumerator(long numerator){
        this.numerator=numerator;
    }
    public long getnumerator(){
        return numerator;
    }
    public void setdenominator(long denominator){
        this.denominator=denominator;
    }
    public long getdenominator(){
        return denominator;
    }
   
}
public class J04003 {
   public static Scanner sc = new Scanner(System.in);
   public static long GCD(long a , long b){
        if(b==0){
            return a;
        }else{
            return GCD(b,a%b);
        }
   }
   public static fraction reducefrations(fraction p){
        fraction t =new fraction(p.getnumerator(), p.getdenominator());
        long x = t.getnumerator();
        long y = t.getdenominator();
        long ucln = GCD(x,y);
        t.setnumerator(x/ucln);
        t.setdenominator(y/ucln);
        return t;
   } 
   public static void in(fraction p){
        System.out.print(p.getnumerator()+"/");
        System.out.print(p.getdenominator());
   }
   public static void main(String[]args){
        long x = sc.nextLong();
        long y = sc.nextLong();
        fraction p = new fraction(x,y);
        p = reducefrations(p);
        in(p);
   }
}
