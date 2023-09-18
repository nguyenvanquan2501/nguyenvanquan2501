/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package j05008;

/**
 *
 * @author vanquan
 */
import java.util.*;

class Point {
    private double x;
    private double y;

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double distance(Point p) {
        return Math.sqrt(Math.pow(this.x - p.x, 2) + Math.pow(this.y - p.y, 2));
    }
}

class Line {
    private Point A;
    private Point B;

    public Line(Point A, Point B) {
        this.A = A;
        this.B = B;
    }

    public double getLength() {
        return A.distance(B);
    }
}

class Triangle {
    private Line AB, AC, BC;

    public Triangle(Line AB, Line AC, Line BC) {
        this.AB = AB;
        this.AC = AC;
        this.BC = BC;
    }

    public double getArea() {
        double a = BC.getLength();
        double b = AC.getLength();
        double c = AB.getLength();
        double s = (a + b + c) / 2;
        return Math.sqrt(s * (s - a) * (s - b) * (s - c));
    }
}

public class J05008 {
    public static Scanner sc = new Scanner(System.in);

    public static void test() {
        int n = sc.nextInt();
        sc.nextLine();
        Point[] dsPoint = new Point[n];
        for (int i = 0; i < n; i++) {
            double x = sc.nextDouble();
//            sc.nextLine();
            double y=sc.nextDouble();
//            sc.nextLine();
            dsPoint[i] = new Point(x, y);
        }
        double areaPolygonal = 0;
        for (int i = 1; i < n - 1; i++) {
            Line AB = new Line(dsPoint[0], dsPoint[i]);
            Line AC = new Line(dsPoint[0], dsPoint[i + 1]);
            Line BC = new Line(dsPoint[i], dsPoint[i + 1]);
            Triangle triangle = new Triangle(AB, AC, BC);
            areaPolygonal += triangle.getArea();
        }
        System.out.printf("%.3f\n", areaPolygonal);
    }

    public static void main(String[] args) {
        int t = sc.nextInt();
        while (t-- > 0) {
            test();
        }
    }
}


