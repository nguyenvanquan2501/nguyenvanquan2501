import java.util.*;
import java.lang.Math.*;
class Point{
    private double x;
    private double y;
    public Point(){
        // x = 0;
        // y = 0;
    }
    public Point(double x, double y){
        this.x=x;
        this.y=y;
    }
    // public Point(Point p) {
    //     this.x = p.x;
    //     this.y = p.y;
    // }
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
        return Math.sqrt(Math.pow(getX()-p.x,2)+Math.pow(getY()-p.y,2));
    }
    public double distance(Point p1, Point p2){
        return Math.sqrt(Math.pow((p1.x-p2.x),2)+Math.pow((p1.y-p2.y),2));
    }

}
public class J04001 {
    public static Scanner sc = new Scanner(System.in);
    public static void test(){
        double x = sc.nextDouble();
        double y = sc.nextDouble();
        Point X = new Point(x,y);
        x = sc.nextDouble();
        y = sc.nextDouble();
        Point Y = new Point(x,y);
        System.out.printf("%.4f\n",Y.distance(X))  ;     
    }
    public static void main(String[]args){
        int t = sc.nextInt();
    while(t-->0){
        test();
    }
    }
}
