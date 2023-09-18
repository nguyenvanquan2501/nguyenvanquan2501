import java.util.*;
class Student{
    private String ID,Name,DayofBirth;
    private double subject1,subject2,subject3,sum;
    public int id = 1;
    public Student(String Name, String DayofBirth,double subject1,double subject2, double subject3){
        this.ID=Integer.toString(id++);
        this.Name=Name;
        this.DayofBirth=DayofBirth;
        this.subject1=subject1;
        this.subject2=subject2;
        this.subject3=subject3;
    }
    public double getSum(){
        return sum = subject1+subject2+subject3;
    }
    @Override
    public String toString(){
        return ID+" "+Name+" "+DayofBirth+" "+getSum();
    }
}
class ScoreComparator implements Comparator<Student> {
    @Override
    public int compare(Student student1, Student student2) {
        return Double.compare(student2.getSum(), student1.getSum()); // Sắp xếp từ cao đến thấp
    }
}
public class J05009 {
    public static Scanner sc = new Scanner(System.in);
    public static void main(String[]args){
        int n = sc.nextInt();
        sc.nextLine();
        Student[] sv = new Student[n];
        for(int i=0;i<n;i++){
            sv[i] = new Student(sc.nextLine(), sc.nextLine(), Double.parseDouble(sc.nextLine()), Double.parseDouble(sc.nextLine()), Double.parseDouble(sc.nextLine()));
        }
        Arrays.sort(sv,new ScoreComparator());
        for(Student s : sv){
            System.out.println(s);
        }
    }
}
