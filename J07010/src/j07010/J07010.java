/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package j07010;

/**
 *
 * @author vanquan
 */
import java.util.*;
import java.util.logging.SimpleFormatter;
import java.io.*;
import java.text.*;
class Student{
    private String idStudent,nameStudent,classStudent,birthday;
    private int id;
    private double gpa;
    public Student(int id,String nameStudent,String classStudent,String birthday,double gpa) throws ParseException{
        this.id=id;
        this.nameStudent=nameStudent;
        this.idStudent=String.format("B20DCCN%03d",id);
        this.classStudent=classStudent;
        this.birthday=nomalizeBirthday(birthday);
        this.gpa=gpa;
    }
    public String nomalizeBirthday(String birthday) throws ParseException{
        SimpleDateFormat inputFormat = new SimpleDateFormat("d/M/yyyy");
        SimpleDateFormat outputFormat = new SimpleDateFormat("dd/MM/yyyy");
        Date date = inputFormat.parse(birthday);
        String ouputDate = outputFormat.format(date);
        return ouputDate;
    }
    @Override 
    public String toString(){
        return idStudent+" "+nameStudent+" "+classStudent+" "+birthday+" "+String.format("%.2f", gpa);
    }
}
public class J07010 {
    public static void main(String[]args) throws FileNotFoundException, ParseException{
        File file = new File("SV.in");
        Scanner sc = new Scanner(file);
        int n = Integer.parseInt(sc.nextLine());
        Student[] ds = new Student[n];
        int id = 1;
        for(int i=0;i<n;i++){
            String name = sc.nextLine();
            String classstudent = sc.nextLine();
            String birhtday = sc.nextLine();
            double gpa = Double.parseDouble(sc.nextLine());
            ds[i] = new Student(id++, name, classstudent, birhtday, gpa);
        }
        for(Student num : ds){
            System.out.println(num);
        }
    }
}

