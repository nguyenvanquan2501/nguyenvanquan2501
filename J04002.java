import java.util.*;
import java.lang.Math.*;

class Rectange{
    private double width;
    private double height;
    private String color;
    public Rectange(){
        width = 1;
        height = 1;
    }
    public Rectange(double height, double width, String color){
        this.width=width;
        this.height=height;
        this.color = color;
    }
    public void setWidth(double width){
        this.width=width;
    }
    public double getWidth(){
        return width;
    }
    public void setHeight(double height){
        this.height=height;
    }
    public double getHeight(){
        return height;
    }
    public void setColor(String color){
        this.color = color;
    }
     public String getColor() {
        return color.substring(0, 1).toUpperCase() + color.substring(1).toLowerCase();
    }
    public double findArea(){
        return height*width;
    }
    public double findPerimeter(){
        return 2*(width+height);
    }
}

public class J04002 {
    public static Scanner sc = new Scanner(System.in);
    public static void in(Rectange X){
        if(X.getHeight()>0 && X.getWidth()>0){
            System.out.println((int)X.findPerimeter()+" "+(int)X.findArea()+" "+X.getColor());
        }else{
            System.out.println("INVALID");
        }
    } 
    public static void main(String[]args){
        double height = sc.nextDouble();
        double width = sc.nextDouble();
        String color = sc.next();
        Rectange X = new Rectange(height,width,color);
        in(X);
    }   
}
