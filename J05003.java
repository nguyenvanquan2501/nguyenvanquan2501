import java.util.*;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
class Student{
    private String MSV="B20DCCN",Name,date,lop;
    private double gpa;
    public Student(){

    }
    // public void getGpa(){
    //     System.out.printf("%.2f",gpa); 
    // }
    public Student(String ID,String Name,String date,String lop,double gpa){
        this.MSV=MSV+ID;
        this.Name= Name;
        this.date=date;
        this.lop=lop;
        this.gpa=gpa;
        DateTimeFormatter inputTimeFormatter = DateTimeFormatter.ofPattern("d/M/yyyy");
        DateTimeFormatter outputFormatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate parsedDate = LocalDate.parse(date, inputTimeFormatter);
        this.date = parsedDate.format(outputFormatter);
    }
    @Override
    public String toString(){
        return MSV+" "+Name+" "+lop+" "+date+" "+" "+ String.format("%.2f", gpa);
    }
}
public class J05003 {
    public static Scanner sc = new Scanner(System.in);
    public static int id = 1;
    public static void main(String[]args){
        int n = sc.nextInt();
        Student[] ds = new Student[n];
        for(int i = 1;i<=n;i++){
            String s = Integer.toString(id);
            while(s.length()<3){
                s = "0"+s;
            } 
            ds[i] = new Student(s,sc.nextLine(),sc.nextLine(),sc.nextLine(),sc.nextDouble());
            id++;
        }
        for(Student num : ds){
            System.out.print(num);
        }

    }
}
