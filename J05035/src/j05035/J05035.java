/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package j05035;

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

    public String getMSV() {
        return MSV;
    }

    @Override
    public String toString() {
        return STT + " " + MSV + " " + Name + " " + Lop + " " + Email + " " + AbbreviationOfCompany;
    }
}

class MSVComparator implements Comparator<Student> {
    @Override
    public int compare(Student sv1, Student sv2) {
        return sv1.getMSV().compareTo(sv2.getMSV()); // Sort by MSV
    }
}

public class J05035 {
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int n = sc.nextInt();
        sc.nextLine();
        Map<String, List<Student>> companyMap = new HashMap<>();
        for (int i = 0; i < n; i++) {
            String id = sc.nextLine().trim();
            String name = sc.nextLine().trim();
            String className = sc.nextLine().trim();
            String email = sc.nextLine().trim();
            String company = sc.nextLine().trim();

            Student student = new Student(id, name, className, email, company);
            companyMap.putIfAbsent(company, new ArrayList<>());
            companyMap.get(company).add(student);
        }

        // Sort students by MSV for each company
        for (List<Student> students : companyMap.values()) {
            students.sort(new MSVComparator());
        }

        int q = sc.nextInt();
        sc.nextLine();
        while (q-- > 0) {
            String AbbreviationOfCompany = sc.nextLine();
            List<Student> students = companyMap.get(AbbreviationOfCompany);
            for (Student student : students) {
                System.out.println(student);
            }
        }
    }
}

