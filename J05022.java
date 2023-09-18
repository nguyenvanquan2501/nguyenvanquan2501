import java.util.*;
class Student{
    private String MSV,Name,Lop,Email;
    public Student(String MSV,String Name,String Lop,String Email){
        this.MSV=MSV;
        this.Name=Name;
        this.Lop=Lop;
        this.Email=Email;
    }
    public String getLop(){
        return Lop;
    }
    @Override
    public String toString(){
        return MSV+" "+Name+" "+Lop+" "+Email;
    }
}
class ClassComparator implements Comparator<Student>{
    @Override
    public int compare(Student sv1, Student sv2){
        if(sv1.getLop().equals(sv2.getLop())){
            return 1;
        }else{
            return 0;
        }
    }
}
public class J05022 {
    public static Scanner sc = new Scanner(System.in);
    public static void test(Student[] ds, String classname){
        System.out.println("DANH SACH SINH VIEN LOP "+classname+":");
        for(Student num:ds){
            if(num.getLop().equals(classname)){
                System.out.println(num);
            }
        }
    }
    public static void main(String[]args){
        int n = sc.nextInt();
        sc.nextLine();
        Student[] ds = new Student[n];
        for(int i=0;i<n;i++){
            ds[i]=new Student(sc.nextLine(),sc.nextLine(),sc.nextLine(),sc.nextLine());
        }
        int t = sc.nextInt();
        sc.nextLine();
        String classname = sc.nextLine();
        Arrays.sort(ds,new ClassComparator());
        while(t-->0){
            test(ds,classname);
        } 
    }
}
