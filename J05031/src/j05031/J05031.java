/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package j05031;

/**
 *
 * @author vanquan
 */

import java.util.*;
class Student{
    private String STT,MSV,Name,Lop;
    //public static int stt=1;
    private double subject1,subject2,subject3;
    public Student(String MSV,String Name,String Lop,double subject1,double subject2,double subject3){
        //this.STT=Integer.toString(stt++);
        this.MSV=MSV;
        this.Name=Name;
        this.Lop=Lop;
        this.subject1=subject1;
        this.subject2=subject2;
        this.subject3=subject3;
    }
    public String getLop(){
        return Lop;
    }
    public String getMSV(){
        return MSV;
    }
    public String getName(){
        return Name;
    }
    @Override
    public String toString(){
        return MSV+" "+Name+" "+Lop+" "+String.format("%.1f", subject1)+" "+String.format("%.1f", subject2)+" "+String.format("%.1f", subject3);
    }
}
class ClassComparator implements Comparator<Student>{
    @Override
    public int compare(Student sv1, Student sv2){
        return sv1.getName().compareTo(sv2.getName());
    }
}
public class J05031 {
    public static Scanner sc = new Scanner(System.in);
    public static int stt=1;
    public static void main(String[]args){
        int n = sc.nextInt();
        sc.nextLine();
        Student[] ds = new Student[n];
        for(int i=0;i<n;i++){
            ds[i]=new Student(sc.nextLine(),sc.nextLine(),sc.nextLine(),Double.parseDouble(sc.nextLine()),Double.parseDouble(sc.nextLine()),Double.parseDouble(sc.nextLine()));
        }
        Arrays.sort(ds,new ClassComparator());
        for(Student num:ds){
            System.out.print(stt+++" ");
            System.out.println(num);
        }
    }
}

