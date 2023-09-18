import java.util.*;
class Point{
    private double x;
    private double y;
  
    public Point(double x, double y){
        this.x=x;
        this.y=y;
    }
    
    public void setX(double x){
        this.x=x;
    }
    public void setY(double y){
        this.y= y;
    }
    public double getX(){
        return x;
    }
    public double getY(){
        return y;
    }
    public double distance(Point p){
        return Math.sqrt(Math.pow(this.x-p.x,2)+Math.pow(this.y-p.y,2));
    }
    public double distance(Point p1, Point p2){
        return Math.sqrt(Math.pow((p1.x-p2.x),2)+Math.pow((p1.y-p2.y),2));
    }

}
class Line extends Point {
    private Point A;
    private Point B;
    private double Length;

    public Line(Point A, Point B) {
        super(0, 0); 
        this.A = A;
        this.B = B;
    }
    public double getLength(){
        return Length=A.distance(B);
    }
}

class Triangle extends Line {
    private Line AB, AC, BC;
    private double a, b, c, Area, Premeter;

    public Triangle(Line AB, Line AC, Line BC) {
        super(null, null);
        this.AB = AB;
        this.AC = AC;
        this.BC = BC;
    }
        
    public double getArea() {
        this.a = BC.getLength(); 
        this.b = AC.getLength();
        this.c = AB.getLength();
        this.Area = (1.0/4)*Math.sqrt(a+b+c)*Math.sqrt(a+b-c)*Math.sqrt(a+c-b)*Math.sqrt(b+c-a);
        return Area;
    }
    public double getPremeter(){
        this.a = BC.getLength(); 
        this.b = AC.getLength();
        this.c = AB.getLength();
        return a+b+c;
    }
}
public class J04010 {
    public static Scanner sc = new Scanner(System.in);
    public static void test(){
        double x = sc.nextDouble();
        double y = sc.nextDouble();
        Point A = new Point(x,y);
        x = sc.nextDouble();
        y = sc.nextDouble();
        Point B = new Point(x,y);
        x = sc.nextDouble();
        y = sc.nextDouble();
        Point C = new Point(x,y);
        Line a = new Line(B,C);
        Line b = new Line(A,C);
        Line c = new Line(A,B);
        Triangle ABC = new Triangle(c, b, a);

        if(a.getLength()+b.getLength()>c.getLength() && a.getLength()+c.getLength()>b.getLength() && b.getLength()+c.getLength() >a.getLength()){
            double R = (1.0/4)*(a.getLength()*b.getLength()*c.getLength())/(ABC.getArea());
            double S = Math.PI*R*R;
            System.out.printf("%.3f\n",S);
        }else{
            System.out.println("INVALID");
        }
    }
    public static void main(String[]args){
        int t = sc.nextInt();
        while(t-->0){
            test();
        }
    }
}
