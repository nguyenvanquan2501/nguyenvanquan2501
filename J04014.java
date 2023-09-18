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
public class J04014 {
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
    public static fraction MulFraction(fraction a, fraction b){
        long numerator = a.getnumerator()*b.getnumerator();
        long denominator = a.getdenominator()*b.getdenominator();
        fraction p = new fraction(numerator,denominator);
        return reducefrations(p);
    }
    public static void test(){
        int x = sc.nextInt();
        int y = sc.nextInt();
        fraction A = new fraction(x, y);
        x = sc.nextInt();
        y = sc.nextInt();
        fraction B = new fraction(x, y);
        fraction C = MulFraction(sumFractions(A, B),sumFractions(A, B));
        //reducefrations(C);
        fraction D = MulFraction(MulFraction(A,B),C);
        //reducefrations(D);
        System.out.print(C.getnumerator()+"/"+C.getdenominator());
        System.out.print(" "+D.getnumerator()+"/"+D.getdenominator());
        System.out.println();
    }
    public static void main(String[]args){
        int t = sc.nextInt();
        while(t-->0){
            test();
        }
    }
}
