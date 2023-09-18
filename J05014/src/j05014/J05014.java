/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package j05014;

/**
 *
 * @author vanquan
 */
import java.util.*;
class Teacher{
    private String idTeacher,nameTeacher,codeAdmission,subject,results;
    private double informatics,expertise,priority,total;
    public static int id = 1;
    public Teacher(String nameTeacher,String codeAdmission,double informatics,double priority){
        this.idTeacher=String.format("GV%02d",id++);
        this.nameTeacher=nameTeacher;
        this.priority=priority;
        this.informatics=informatics;
        if(codeAdmission.substring(0,1).equals("A")){
            this.subject="TOAN";
        }else if(codeAdmission.substring(0,1).equals("B")){
            this.subject="LY";
        }else{
            this.subject="HOA";
        }
        if(codeAdmission.substring(1,2).equals("1")){
            this.expertise=2.0;
        }else if(codeAdmission.substring(1,2).equals("2")){
            this.expertise=1.5;
        }else if(codeAdmission.substring(1,2).equals("3")){
            this.expertise=1.0;
        }else{
            this.expertise=0;
        }
        this.total = informatics*2+expertise+priority;
        if(total > 18){
            this.results="TRUNG TUYEN";
        }else{
            this.results="LOAI";
        }
    }
    public double getTotal(){
        return total;
    }
    @Override
    public String toString(){
        return idTeacher+" "+nameTeacher+" "+subject+" "+total+" "+results;
    }
}
class TotalResultdComparator implements Comparator<Teacher>{
    @Override
        public int compare(Teacher a, Teacher b) {
            return Double.compare(b.getTotal(), a.getTotal());
        }
}
public class J05014 {
    public static Scanner sc = new Scanner(System.in);
    public static void main(String[]args){
        int n = sc.nextInt();
        sc.nextLine();
        Teacher[] ds = new Teacher[n];
        for(int i=0;i<n;i++){
            String name = sc.nextLine();
            String code = sc.nextLine();
            double informatics = Double.parseDouble(sc.nextLine());
            double priority = Double.parseDouble(sc.nextLine());
            ds[i] = new Teacher(name, code, informatics, priority);
        }
        Arrays.sort(ds, new TotalResultdComparator());
        for(Teacher num : ds){
            System.out.println(num);
        }
    }
}

