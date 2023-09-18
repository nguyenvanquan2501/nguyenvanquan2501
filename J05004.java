import java.util.*;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

class Student{
    private String ID,Name,lop,date;
    private double gpa;
    public static int num=1;
    public Student(String ID,String Name, String lop, String date, double gpa){
        this.ID = String.format("B20DCCN%03d", num++);
        this.Name =formatName(Name);
        this.date=date;
        this.gpa=gpa;
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
    public String toString() {
        return ID + " " + Name + " " + lop + " " + date + " " + String.format("%.2f", gpa);
    }
}
public class J05004 {
    public static Scanner sc = new Scanner(System.in);
    public static String formatDate(String date){
        DateTimeFormatter inputTimeFormatter = DateTimeFormatter.ofPattern("d/M/yyyy");
        DateTimeFormatter outputFormatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate parsedDate = LocalDate.parse(date, inputTimeFormatter);
        return date;
    }
    public static void main(String[]args){
        int n = sc.nextInt();
        for(int i=0;i<n;i++){
            String name = sc.nextLine();
            String lop = sc.nextLine();
            String date = formatDate(sc.nextLine());
            double gpa = sc.nextDouble();
            Student sv = new Student ("",name,lop,date,gpa);
            System.out.print(sv);
        }
    }
}
