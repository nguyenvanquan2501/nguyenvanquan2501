/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package j05024;

/**
 *
 * @author vanquan
 */

import java.util.*;
class Student{
    private String MSV,Name,Lop,Email,codeDiscipline;
    public Student(String MSV,String Name,String Lop,String Email){
        this.MSV=MSV;
        this.Name=Name;
        this.Lop=Lop;
        this.Email=Email;
    }
    public String getDiscipline(){
        if(MSV.contains("DCKT")){
                codeDiscipline="DCKT";
            }else if(MSV.contains("DCCN")){
                codeDiscipline="DCCN";
            }else if(MSV.contains("DCAT")){
                codeDiscipline="DCAT";
            }else if (MSV.contains("DCVT")){
                codeDiscipline="DCVT";
            }else {
                codeDiscipline="DCDT";
            }
        return codeDiscipline;
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
public class J05024 {
    public static Scanner sc = new Scanner(System.in);
    public static void test(Student[] ds, String discipline,String codeDiscipline){
        System.out.println("DANH SACH SINH VIEN NGANH "+discipline+":");
        for(Student num:ds){
            if(num.getDiscipline().equals(codeDiscipline) && !num.getLop().startsWith("E")){
                System.out.println(num);
            }
        }
        System.out.println();
    }
    public static String nomalizeName(String s){
        if(s.length()==1){
            return s.toUpperCase();
        }
        return s.substring(0,1).toUpperCase()+s.substring(1).toUpperCase();
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
            String discipline = sc.nextLine();
            String codeDiscipline = "";
            if(discipline.equals("Ke toan")){
                codeDiscipline="DCKT";
            }else if(discipline.equals("Cong nghe thong tin")){
                codeDiscipline="DCCN";
            }else if(discipline.equals("An toan thong tin")){
                codeDiscipline="DCAT";
            }else if (discipline.equals("Vien thong")){
                codeDiscipline="DCVT";
            }else {
                codeDiscipline="DCDT";
            }
            discipline=nomalizeName(discipline);

            //sc.nextLine();
            test(ds,discipline,codeDiscipline);
        } 
    }
}





