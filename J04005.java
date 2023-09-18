import java.util.*;
class Student{
    private String name,date;
    private float score1,score2,score3,sum_score;
    public Student(String name, String date, float score1, float score2, float score3){
        this.name=name;
        this.date=date;
        this.score1=score1;
        this.score2=score2;
        this.score3=score3;
    }
    public String getName(){
        return name;
    }
    public float sumscore(){
        return (score1+score2+score3);
    }
    public String getDate(){
        return date;
    }
}
public class J04005 {
    public static Scanner sc = new Scanner(System.in);
    public static void in(Student s){
        System.out.print(s.getName()+" "+s.getDate()+" "+s.sumscore());
    }
    public static void main(String[]args){
        String name=sc.nextLine();
        String date=sc.next();
        Float score1=sc.nextFloat();
        Float score2=sc.nextFloat();
        Float score3=sc.nextFloat();
        Student s = new Student(name,date,score1,score2,score3);
        in(s);
    }
}
