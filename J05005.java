import java.util.*;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
class Student{
    private String MSV,Name,date,lop;
    private double gpa;
    public static int num=1;
    public Student(String Name,String date,String lop,double gpa){
        this.Name=formatName(Name);
        this.date=formatDate(date);
        this.lop=lop;
        this.gpa=gpa;
        this.MSV=String.format("B20DCCN%03d",num++);
    }
    public double getGpa(){
        return gpa;
    }
    private String formatDate(String date){
        DateTimeFormatter inputTimeFormatter = DateTimeFormatter.ofPattern("d/M/yyyy");
        DateTimeFormatter outputFormatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate parsedDate = LocalDate.parse(date, inputTimeFormatter);
        return date;
    }
    private String formatName(String name) {
        String[] words = name.trim().split("\\s+");
        String res = "";
        for (String word : words) {
            res += word.substring(0, 1).toUpperCase() + word.substring(1).toLowerCase() + " ";
        }
        return res.substring(0, res.length() - 1);
    }
    @Override
    public int compareTo(Student other) {
        return -(this.getGpa().compareTo(other.getGpa()));
    }
    return 0;
}

    @Override
    public String toString(){
        return MSV+" "+Name+" "+lop+" "+date+ String.format("%.2f", gpa);
    }
}

public class J05005 {
    public static Scanner sc = new Scanner(System.in);
    public static void main(String[]args){
        int n = sc.nextInt();
        List<Student> sv = new ArrayList<>();
        for(int i=0;i<n;i++){
            sc.nextLine();
           Student a = new Student(sc.nextLine(),sc.nextLine(),sc.nextLine(),sc.nextDouble());
            sv.add(a);
        }
        Collections.sort(sv);
        for(Student s : sv){
            System.out.println(s);
        }
    }
}
