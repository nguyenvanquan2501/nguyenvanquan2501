import java.util.*;
class Point{
    private double x,y;
    public Point(){

    }
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
    public double distance (Point A, Point B){
        return Math.sqrt(Math.pow(A.x-B.x,2)+Math.pow(A.y-B.y,2));
    }
     public static Point nextPoint(Scanner scanner) {
    double x = scanner.nextDouble();
    double y = scanner.nextDouble();
    return new Point(x, y);
}

}
class Triangle extends Point{
    private Point A,B,C;
    public Triangle(Point A, Point B,Point C){
        super();
        this.A=A;
        this.B=B;
        this.C=C;
    }
    public boolean valid() {
    double a = super.distance(B, C); // Gọi phương thức từ lớp cha
    double b = super.distance(A, C);
    double c = super.distance(A, B);
    if (a + b > c && a + c > b && b + c > a) {
        return true;
    } else {
        return false;
    }
}

public String getPerimeter() {
    return String.format("%.3f",super.distance(A, B) + super.distance(A, C) + super.distance(C, B));
}

    
}
public class J04019 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- >0){
            Triangle a = new Triangle(Point.nextPoint(sc), Point.nextPoint(sc), Point.nextPoint(sc));
            if(!a.valid()){
                System.out.println("INVALID");
            } else{
                System.out.println(a.getPerimeter());
            }
        }
    }
}
