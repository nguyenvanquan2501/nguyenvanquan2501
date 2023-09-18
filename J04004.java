import java.util.*;
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
public class J04004 {
    public static Scanner sc = new Scanner(System.in);
    public static long GCD(long a, long b){
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
    public static fraction sumFractions(fraction a, fraction b){
        long mcnn = (a.getdenominator()*b.getdenominator());
        fraction p = new fraction(1,1);
        p.setnumerator(a.getnumerator()*b.getdenominator()+b.getnumerator()*a.getdenominator());
        p.setdenominator(mcnn);
        p=reducefrations(p);
        return p;
    }
    public static void in(fraction p){
        System.out.print(p.getnumerator()+"/");
        System.out.print(p.getdenominator());
    }
    public static void main(String[]args){
        long x = sc.nextLong();
        long y = sc.nextLong();
        fraction a = new fraction(x,y);
        x = sc.nextLong();
        y = sc.nextLong();
        fraction b = new fraction(x,y);
        fraction p = sumFractions(a, b);
        in(p);
    }
}
