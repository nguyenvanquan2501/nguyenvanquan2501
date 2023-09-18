/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package j05058;

/**
 *
 * @author vanquan
 */

import java.util.*;
class Student{
    private String ID,Name,inform;
    private double math,physical,chemistry,prioirity,totalsubject,examScore;
    public Student(String ID,String Name,double math,double physical,double chemistry){
        this.ID=ID;
        this.Name=Name;
        this.math=math;
        this.physical=physical;
        this.chemistry=chemistry;
        this.totalsubject=2*math+physical+chemistry;
        if(ID.substring(0,3).equals("KV1")){
            this.prioirity=0.5;
        }else if(ID.substring(0,3).equals("KV2")){
            this.prioirity=1.0;
        }else{
            this.prioirity=2.5;
        }
        this.examScore=totalsubject+prioirity;
        if(examScore>=24){
            this.inform="TRUNG TUYEN";
        }else{
            this.inform="TRUOT";
        }
    }
    public String getID(){
        return ID;
    }
    public double getExamScore(){
        return examScore;
    }
    @Override
public String toString(){
    String priorityStr = (prioirity == (int)prioirity) ? String.valueOf((int)prioirity) : String.valueOf(prioirity);
    String examStr = (examScore == (int)examScore) ? String.valueOf((int)examScore) : String.valueOf(examScore);
    return ID + " " + Name + " " + priorityStr + " " + examStr + " " + inform;
}
}
class InformComparator implements Comparator<Student>{
    public int compare(Student sv1, Student sv2){
        if(sv1.getExamScore()==sv2.getExamScore()){
            return sv1.getID().compareTo(sv2.getID());
        }
        return Double.compare(sv2.getExamScore(),sv1.getExamScore());
    }
}
public class J05058{
    public static Scanner sc = new Scanner(System.in);
    public static void main(String[]args){
        int n = sc.nextInt();
        sc.nextLine();
        Student[] ds = new Student[n];
        for(int i=0;i<n;i++){
            String ID = sc.nextLine();
            String name = sc.nextLine();
            double math = Double.parseDouble(sc.nextLine());
            double physical = Double.parseDouble(sc.nextLine());
            double chemistry = Double.parseDouble(sc.nextLine());
            ds[i]= new Student(ID,name,math,physical,chemistry);
        }
        Arrays.sort(ds,new InformComparator());
        for(Student num : ds){
            System.out.println(num);
        }
    }
}