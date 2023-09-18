/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package j05057;

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
    @Override
public String toString(){
    String priorityStr = (prioirity == (int)prioirity) ? String.valueOf((int)prioirity) : String.valueOf(prioirity);
    String totalSubjectStr = (totalsubject == (int)totalsubject) ? String.valueOf((int)totalsubject) : String.valueOf(totalsubject);
    return ID + " " + Name + " " + priorityStr + " " + totalSubjectStr + " " + inform;
}

}
public class J05057{
    public static Scanner sc = new Scanner(System.in);
    public static void main(String[]args){
        int n = sc.nextInt();
        sc.nextLine();
        for(int i=0;i<n;i++){
            String ID = sc.nextLine();
            String name = sc.nextLine();
            double math = Double.parseDouble(sc.nextLine());
            double physical = Double.parseDouble(sc.nextLine());
            double chemistry = Double.parseDouble(sc.nextLine());
            Student sv = new Student(ID,name,math,physical,chemistry);
            System.out.println(sv);
        }
    }
}