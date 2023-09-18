/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package j05029;

/**
 *
 * @author vanquan
 */

import java.util.*;

class Company {
    private String ID, Name;
    private int Number;

    public Company(String ID, String Name, int Number) {
        this.ID = ID;
        this.Name = Name;
        this.Number = Number;
    }

    public int getNumber() {
        return Number;
    }

    public String getID() {
        return ID;
    }

    @Override
    public String toString() {
        return ID + " " + Name + " " + Number;
    }
}

class NumberComparator implements Comparator<Company> {
    @Override
    public int compare(Company a, Company b) {
        if (a.getNumber() == b.getNumber()) {
            return a.getID().compareTo(b.getID()); // Sắp xếp theo mã doanh nghiệp nếu số lượng giống nhau
        }
        return Integer.compare(b.getNumber(), a.getNumber()); // Sắp xếp theo số lượng giảm dần
    }
}

public class J05029 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        Company[] ds = new Company[n];
        for (int i = 0; i < n; i++) {
            ds[i] = new Company(sc.nextLine(), sc.nextLine(), Integer.parseInt(sc.nextLine()));
        }

        int Q = sc.nextInt(); // Đọc số truy vấn
        for (int i = 0; i < Q; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            System.out.println("DANH SACH DOANH NGHIEP NHAN TU " + a + " DEN " + b + " SINH VIEN:");
            Arrays.stream(ds).filter(company -> company.getNumber() >= a && company.getNumber() <= b).sorted(new NumberComparator()).forEach(System.out::println);
        }
    }
}

