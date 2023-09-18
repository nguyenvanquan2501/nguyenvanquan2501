/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package j05003;

/**
 *
 * @author vanquan
 */
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Scanner;

class Student {

    public static int NUM = 1;
    public String id, name, classs, dateOfBirth;
    public float gpa;

    public Student(String name, String classs, String dateOfBirth, float gpa) {
        this.id = String.format("B20DCCN%03d", NUM++);
        this.name = name;
        this.classs = classs;
        this.dateOfBirth = dateOfBirth;
        this.gpa = gpa;
    }

    @Override
    public String toString() {
        return id + " " + name + " " + classs + " " + dateOfBirth + " " + String.format("%.2f", gpa);
    }
}

public class J05003 {

    public static void main(String[] args) throws ParseException {
        Scanner sc = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        int n = Integer.parseInt(sc.nextLine());
        for (int i = 0; i < n; i++) {
            String name = sc.nextLine();
            String classs = sc.nextLine();
            String dateOfBirth = sdf.format(sdf.parse(sc.nextLine()));
            float gpa = Float.parseFloat(sc.nextLine());
            Student student = new Student(name, classs, dateOfBirth, gpa);
            System.out.println(student);
        }
    }
}