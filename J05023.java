import java.util.*;

class Student {
    private String MSV, Name, Lop, Email;

    public Student(String MSV, String Name, String Lop, String Email) {
        this.MSV = MSV;
        this.Name = Name;
        this.Lop = Lop;
        this.Email = Email;
    }
    public String getMSV(){
        return MSV;
    }
    public String getCourseYear() {
        return MSV.substring(1, 3);
    }

    @Override
    public String toString() {
        return MSV + " " + Name + " " + Lop + " " + Email;
    }
}

class ClassComparator implements Comparator<Student> {
    @Override
    public int compare(Student sv1, Student sv2) {
        return sv1.getMSV().compareTo(sv2.getMSV());
    }
}

public class J05023 {
    public static Scanner sc = new Scanner(System.in);

    public static void test(Student[] ds, String Year) {
        System.out.println("DANH SACH SINH VIEN KHOA " + Year + ":");
        for (Student num : ds) {
            if (num.getCourseYear().equals(Year.substring(2))) {
                System.out.println(num);
            }
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int n = sc.nextInt();
        sc.nextLine();
        Student[] ds = new Student[n];
        for (int i = 0; i < n; i++) {
            ds[i] = new Student(sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine());
        }
        int t = sc.nextInt();
        sc.nextLine();
        Arrays.sort(ds, new ClassComparator());
        while (t-- > 0) {
            String Year = sc.nextLine();
            test(ds, Year);
        }
    }
}
