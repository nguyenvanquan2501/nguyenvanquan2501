import java.util.*;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

class Student { 
    private String msv;
    private String name, lop, date;
    private float gpa;
    
    public Student(String msv, String name, String lop, String date, float gpa) {
        this.msv = msv;
        this.name = name;
        this.lop = lop;
        this.date = date;
        this.gpa = gpa;
    }

    public String getMsv() {
        return msv;
    }

    public String getName() {
        return name;
    }

    public String getDate() {
        return date;
    }

    public String getLop() {
        return lop;
    }

    public float getGpa() {
        return gpa;
    }
}

public class J04006 {
    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        String msv = "B20DCCN001";
        String name = sc.nextLine();
        String lop = sc.nextLine();
        String date = sc.nextLine();
        float gpa = sc.nextFloat();
        
        // Convert date format
        DateTimeFormatter inputTimeFormatter = DateTimeFormatter.ofPattern("d/M/yyyy");
        DateTimeFormatter outputFormatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate parsedDate = LocalDate.parse(date, inputTimeFormatter);
        date = parsedDate.format(outputFormatter);
        
        Student s = new Student(msv, name, lop, date, gpa);
        System.out.print(s.getMsv() + " " + s.getName() + " " + s.getLop() + " " + s.getDate() + " ");
        System.out.printf("%.2f", s.getGpa());
    }
}
