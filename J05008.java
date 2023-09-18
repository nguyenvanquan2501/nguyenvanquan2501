import java.util.*;
class Point{
    private double x;
    private double y;
  
    public Point(double x, double y){
        this.x=x;
        this.y=y;
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
    private double a, b, c, Area;

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
}
public class J05008 {
    public static Scanner sc = new Scanner(System.in);
    public static void test(){
        int n = sc.nextInt();//so dinh cua da giac
        sc.nextLine();
        Point[] dsPoint = new Point[n];
        for(int i=0;i<n;i++){
            double x = Double.parseDouble(sc.nextLine());
            double y = Double.parseDouble(sc.nextLine());
            dsPoint[i] = new Point(x,y);
        }
        double areaPolygonal = 0;
        int i=0;
        for(int j=1;i<n-1;i++){
            Line AB = new Line(dsPoint[0], dsPoint[j]);
            Line AC = new Line(dsPoint[0], dsPoint[j+1]);
            Line BC = new Line(dsPoint[j], dsPoint[j+1]);
            Triangle triangle = new Triangle(AB, AC,BC);
            areaPolygonal +=triangle.getArea();
        }
        System.out.printf(String.format("%.3f"),areaPolygonal);
        System.out.println();
    }
    public static void main(String[]args){
        int t = sc.nextInt();
        while(t-->0){
            test();
        }
    }
}
