package j05020;
import java.util.*;

class Student {
    private String msv, name, lop, email;

    public Student(String msv, String name, String lop, String email) {
        this.msv = msv;
        this.name = name;
        this.lop = lop;
        this.email = email;
    }

    public String getLop() {
        return lop;
    }

    public String getMsv() {
        return msv;
    }

    @Override
    public String toString() {
        return msv + " " + name + " " + lop + " " + email;
    }
}

class ClassComparator implements Comparator<Student> {
    @Override
    public int compare(Student sv1, Student sv2) {
        int classComparison = sv1.getLop().compareTo(sv2.getLop());
        if (classComparison == 0) {
            return sv1.getMsv().compareTo(sv2.getMsv()); // sắp xếp theo mã sinh viên nếu cùng lớp
        }
        return classComparison;
    }
}

public class J05020 {
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int n = sc.nextInt();
        sc.nextLine();
        Student[] ds = new Student[n];
        for (int i = 0; i < n; i++) {
            ds[i] = new Student(sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine());
        }
        Arrays.sort(ds, new ClassComparator());
        for (Student num : ds) {
            System.out.println(num);
        }
    }
}
