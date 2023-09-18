
import java.util.*;

import java.util.Scanner;

class Employys{
    private String ID,Name,Post;
    public static int id = 1;
    private int Num,salary,Total,Pension,allSalary,advence;
    public Employys(String Name, int salary,int Num, String Post){
        this.ID=String.format("NV%02d",id++);
        this.Name=Name;
        this.salary=salary;// luong co ban
        this.allSalary=salary*Num;
        if(Post.equals("GD")){
            this.Pension=500;
            this.Total=allSalary+Pension;
        }else if(Post.equals("PGD")){
            this.Pension=400;
            this.Total=allSalary+Pension;
        }else if(Post.equals("TP")){
            this.Pension=300;
            this.Total=allSalary+Pension;
        }else if(Post.equals("KT")){
            this.Pension=250;
            this.Total=allSalary+Pension;
        }else{
            this.Pension=100;
            this.Total=allSalary+Pension;
        }
        if((Pension+Total)*2/3<25000){
            this.advence=Math.round((Pension+Total)*2/3/1000)*1000;
        }
    }
    public int getTotal(){
        return Total;
    }
    @Override
    public String toString(){
        return ID+" "+Name+" "+Pension+" "+" "+Total+" "+advence+" "+(Total-advence);
    }
}
public class J05043 {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        int sum=0;
        for(int i=0;i<n;i++){
            Employys nv = new Employys(sc.nextLine(),Integer.parseInt(sc.nextLine()),Integer.parseInt(sc.nextLine()),sc.nextLine());
            System.out.println(nv);
            // sum+=nv.getTotal();
        }
        //System.out.print("Tong chi phi tien luong: "+sum);
    }
}

