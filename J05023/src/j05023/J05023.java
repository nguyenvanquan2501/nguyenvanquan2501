/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package j05023;

/**
 *
 * @author vanquan
 */
import java.util.*;

class Student {
    private String MSV, Name, Lop, Email;

    public Student(String MSV, String Name, String Lop, String Email) {
        this.MSV = MSV;
        this.Name = Name;
        this.Lop = Lop;
        this.Email = Email;
    }

    public String getCourseYear() {
        return "20" + MSV.substring(1, 3);
    }

    @Override
    public String toString() {
        return MSV + " " + Name + " " + Lop + " " + Email;
    }
}

public class J05023 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        List<Student> students = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            String id = sc.nextLine();
            String name = sc.nextLine();
            String className = sc.nextLine();
            String email = sc.nextLine();
            students.add(new Student(id, name, className, email));
        }

        int q = sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < q; i++) {
            String courseYear = sc.nextLine();
            System.out.println("DANH SACH SINH VIEN KHOA " + courseYear + ":");
            for (Student student : students) {
                if (student.getCourseYear().equals(courseYear)) {
                    System.out.println(student);
                }
            }
            System.out.println();
        }
    }
}
