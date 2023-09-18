/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package j05022;

/**
 *
 * @author vanquan
 */
import java.util.*;
class Student{
    private String MSV,Name,Lop,Email;
    public Student(String MSV,String Name,String Lop,String Email){
        this.MSV=MSV;
        this.Name=Name;
        this.Lop=Lop;
        this.Email=Email;
    }
    public String getMSV(){
        return MSV;
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
        if(sv1.getMSV().equals(sv2.getMSV())){
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
        System.out.println();
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
        Arrays.sort(ds,new ClassComparator());
        while(t-->0){
            String classname = sc.nextLine();
            //sc.nextLine();
            test(ds,classname);
        } 
    }
}

