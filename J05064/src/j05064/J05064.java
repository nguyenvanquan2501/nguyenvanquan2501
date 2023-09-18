/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package j05064;

/**
 *
 * @author vanquan
 */
import java.util.*;
class Teacher{
    private String codeTeacher,nameTeacher;
    private int basicSalary,allowance,totalSalary,levelSalary;
    public Teacher(String codeTeacher,String nameTeacher,int basicSalary){
        this.codeTeacher=codeTeacher;
        this.nameTeacher=nameTeacher;
        if(codeTeacher.substring(0,2).equals("HT")){
            this.allowance=2000000;
        }else if(codeTeacher.substring(0,2).equals("HP")){
            this.allowance=900000;
        }else{
            this.allowance=500000;
        }
        this.totalSalary=basicSalary*(Integer.parseInt(codeTeacher.substring(2)))+allowance;
    }
    public String getcodeteacher(){
        return codeTeacher.substring(0,2);
    }
    @Override
    public String toString(){
        return codeTeacher+" "+nameTeacher+" "+Integer.parseInt(codeTeacher.substring(2))+" "+allowance+" "+totalSalary;
    }
}
public class J05064 {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        Teacher[] ds = new Teacher[n];
        for(int i=0;i<n;i++){
            String codeteacher = sc.nextLine();
            String nameteacher = sc.nextLine();
            int basicsalary = Integer.parseInt(sc.nextLine());
            ds[i] = new Teacher(codeteacher, nameteacher, basicsalary);
        }
        int sumHT = 0;
        int sumHP = 0;
        for (Teacher num : ds) {
                if (num.getcodeteacher().equals("HT") && sumHT < 1) {
                    System.out.println(num);
                    sumHT++;
                } else if (num.getcodeteacher().equals("HP") && sumHP < 2) {
                    System.out.println(num);
                    sumHP++;
                } else if (num.getcodeteacher().equals("GV")) {
                    System.out.println(num);
            }
        }
    }
}

