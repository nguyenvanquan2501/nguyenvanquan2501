/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template


/**
 *
 * @author vanquan
 **/
 import java.util.*;

class Student {
    private String MSV, Name, Lop, Email;

    public Student(String MSV, String Name, String Lop, String Email) {
        this.MSV = MSV;
        this.Name = Name;
        this.Lop = Lop;
        this.Email = Email;
    }

    public String getMSV() {
        return MSV;
    }

    @Override
    public String toString() {
        return MSV + " " + Name + " " + Lop + " " + Email;
    }
}

class MSVComparator implements Comparator<Student> {
    @Override
    public int compare(Student sv1, Student sv2) {
        return sv1.getMSV().compareTo(sv2.getMSV());
    }
}

public class J05021 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Student> ds = new ArrayList<>();
        
        while (sc.hasNext()) {
            String MSV = sc.nextLine();
            String Name = sc.nextLine();
            String Lop = sc.nextLine();
            String Email = sc.nextLine();
            ds.add(new Student(MSV, Name, Lop, Email));
        }
        
        ds.sort(new MSVComparator());
        for (Student student : ds) {
            System.out.println(student);
        }
    }
}



