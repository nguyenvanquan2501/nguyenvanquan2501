/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package j05004;

/**
 *
 * @author vanquan
 */
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Scanner;

class Student{
    private String ID,Name,lop,date;
    private double gpa;
    public static int num=1;
    public Student(String Name, String lop, String date, double gpa){
        this.ID = String.format("B20DCCN%03d", num++);
        this.Name =formatName(Name);
        this.date=date;
        this.gpa=gpa;
        this.lop=lop;
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

    public static void main(String[] args) throws ParseException {
        Scanner sc = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        int n = Integer.parseInt(sc.nextLine());
        for (int i = 0; i < n; i++) {
            String name = sc.nextLine();
            String classs = sc.nextLine();
            String dateOfBirth = sdf.format(sdf.parse(sc.nextLine()));
            Double gpa = Double.parseDouble(sc.nextLine());
            Student student = new Student(name, classs, dateOfBirth, gpa);
            System.out.println(student);
        }
    }
}
