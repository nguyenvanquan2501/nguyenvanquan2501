/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package j07058a;

/**
 *
 * @author vanquan
 */
import java.util.*;
import java.io.*;

class Subject {
    private String codeSubjectString, nameSubjectString, formTestString;

    public Subject(String codeSubjectString, String nameSubString, String formTest) {
        this.codeSubjectString = codeSubjectString;
        this.nameSubjectString = nameSubString;
        this.formTestString = formTest;
    }

    public String getCodeSubjectString() {
        return codeSubjectString;
    }

    @Override
    public String toString() {
        return codeSubjectString + " " + nameSubjectString + " " + formTestString;
    }
}

class codeComparator implements Comparator<Subject> {
    @Override
    public int compare(Subject a, Subject b) {
        return a.getCodeSubjectString().compareTo(b.getCodeSubjectString());
    }
}

public class J07058a {
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(new File("MONHOC.in"));
            int n = Integer.parseInt(sc.nextLine()); // Sử dụng sc.nextLine() và sau đó chuyển đổi thành số nguyên
            Subject[] ds = new Subject[n];
            for (int i = 0; i < n; i++) {
                String code = sc.nextLine();
                String name = sc.nextLine();
                String form = sc.nextLine();
                ds[i] = new Subject(code, name, form);
            }
            Arrays.sort(ds, new codeComparator());
            for (Subject num : ds) {
                System.out.println(num);
            }
        } catch (FileNotFoundException e) {
            System.out.println("Có lỗi xảy ra: Không tìm thấy tệp");
            e.printStackTrace();
        }
    }
}

