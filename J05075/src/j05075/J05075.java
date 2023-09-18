/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package j05075;

/**
 *
 * @author vanquan
 */


import java.util.*;

class Student {
    private String studentcode, Name, lop, attdendance, result;
    private int point;

    public Student(String studentcode, String Name, String lop) {
        this.studentcode = studentcode;
        this.Name = Name;
        this.lop = lop;
        this.attdendance = "";
        this.point = 10;
        this.result = "";
    }

    public void setAttdendance(String attdendance) {
        this.attdendance = attdendance;
        int deductions = 0;
        for (char c : attdendance.toCharArray()) {
            if (c == 'v') deductions += 2;
            else if (c == 'm') deductions += 1;
        }
        this.point -= deductions;
        if (this.point < 0) this.point = 0;
        if (this.point == 0) this.result = "KDDK";
    }
    public String getLop(){
        return lop;
    }
    public String getStudentCode() {
        return studentcode;
    }

    @Override
    public String toString() {
        return studentcode + " " + Name + " " + lop + " " + point + (result.isEmpty() ? "" : " " + result);
    }
}

public class J05075 {
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int n = sc.nextInt();
        sc.nextLine();
        Student[] ds = new Student[n];
        for (int i = 0; i < n; i++) {
            String codestudent = sc.nextLine();
            String name = sc.nextLine();
            String lop = sc.nextLine();
            ds[i] = new Student(codestudent, name, lop);
        }
        for (int i = 0; i < n; i++) {
            String codeattdendace = sc.nextLine();
            String[] wordattdendace = codeattdendace.split("\\s+");
            for (Student student : ds) {
                if (wordattdendace[0].equals(student.getStudentCode())) {
                    student.setAttdendance(wordattdendace[1]);
                    break;
                }
            }
        }
        String lop = sc.nextLine();
        for(Student num : ds){
            if(num.getLop().equals(lop)){
                System.out.println(num);
            }
        }
    }
}

