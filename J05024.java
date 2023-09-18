import java.util.*;

class Student {
    private String MSV, Name, Lop, Email;

    public Student(String MSV, String Name, String Lop, String Email) {
        this.MSV = MSV;
        this.Name = Name;
        this.Lop = Lop;
        this.Email = Email;
    }

    public boolean isInMajor(String major) {
        switch (major) {
            case "Ke toan":
                return MSV.contains("DCKT");
            case "Cong nghe thong tin":
                return MSV.contains("DCCN") && !Lop.startsWith("E");
            case "An toan thong tin":
                return MSV.contains("DCAT") && !Lop.startsWith("E");
            case "Vien thong":
                return MSV.contains("DCVT");
            case "Dien tu":
                return MSV.contains("DCDT");
            default:
                return false;
        }
    }

    @Override
    public String toString() {
        return MSV + " " + Name + " " + Lop + " " + Email;
    }
}

public class J05024 {
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
            String major = sc.nextLine();
            System.out.println("DANH SACH SINH VIEN NGANH " + major.toUpperCase() + ":");
            for (Student student : students) {
                if (student.isInMajor(major)) {
                    System.out.println(student);
                }
            }
            System.out.println();
        }
    }
}
