/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package j05034;

/**
 *
 * @author vanquan
 */


import java.util.*;

class Student {
    private String STT, MSV, Name, Lop, Email, AbbreviationOfCompany;
    public static int stt = 1;

    public Student(String MSV, String Name, String Lop, String Email, String Company) {
        this.STT = Integer.toString(stt++);
        this.MSV = MSV;
        this.Name = Name;
        this.Lop = Lop;
        this.Email = Email;
        this.AbbreviationOfCompany = Company;
    }

    public String getAbbreviationOfCompany() {
        return AbbreviationOfCompany;
    }

    public String getName() {
        return Name;
    }

    @Override
    public String toString() {
        return STT + " " + MSV + " " + Name + " " + Lop + " " + Email + " " + AbbreviationOfCompany;
    }
}

class NameComparator implements Comparator<Student> {
    @Override
    public int compare(Student sv1, Student sv2) {
        return sv1.getName().compareTo(sv2.getName()); // Sort by name
    }
}

public class J05034 {
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int n = sc.nextInt();
        sc.nextLine();
        Student[] ds = new Student[n];
        for (int i = 0; i < n; i++) {
            ds[i] = new Student(sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine());
        }
        int q = sc.nextInt();
        sc.nextLine();
        while (q-- > 0) {
            String AbbreviationOfCompany = sc.nextLine();
            List<Student> companyStudents = new ArrayList<>();
            for (Student num : ds) {
                if (AbbreviationOfCompany.equals(num.getAbbreviationOfCompany())) {
                    companyStudents.add(num);
                }
            }
            // Sort students by name for the current company
            companyStudents.sort(new NameComparator());
            for (Student student : companyStudents) {
                System.out.println(student);
            }
        }
    }
}


