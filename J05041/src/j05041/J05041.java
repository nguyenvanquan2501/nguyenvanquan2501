/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package j05041;

/**
 *
 * @author vanquan
 */


/**
 *
 * @author vanquan
 */
import java.util.*;
class Employys{
    private String ID,Name,Post;
    public static int id = 1;
    private int Num,salary,Total,Bonus,Pension,allSalary;
    public Employys(String Name, int salary,int Num, String Post){
        this.ID=String.format("NV%02d",id++);
        this.Name=Name;
        this.salary=salary;
        this.allSalary=salary*Num;
        if(Num>=25){
            this.Bonus=salary*Num*20/100;
        }else if(Num>=22 && Num<25){
            this.Bonus=salary*Num*10/100;
        }else{
            this.Bonus=0;
        }
        if(Post.equals("GD")){
            this.Pension=250000;
            this.Total=allSalary+Pension+Bonus;
        }else if(Post.equals("PGD")){
            this.Pension=200000;
            this.Total=allSalary+Pension+Bonus;
        }else if(Post.equals("TP")){
            this.Pension=180000;
            this.Total=allSalary+Pension+Bonus;
        }else{
            this.Pension=150000;
            this.Total=allSalary+Pension+Bonus;
        }
    }
    public int getTotal(){
        return Total;
    }
    public int getAllSalary(){
        return allSalary;
    }
    @Override
    public String toString(){
        return ID+" "+Name+" "+allSalary+" "+Bonus+" "+Pension+" "+Total;
    }
}
class ToalComparator implements Comparator<Employys>{
    public int compare(Employys a, Employys b){
        return Double.compare(b.getAllSalary(),a.getAllSalary());
    }
}
public class J05041 {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        Employys[] ds = new Employys[n];
        for(int i=0;i<n;i++){
            ds[i] = new Employys(sc.nextLine(),Integer.parseInt(sc.nextLine()),Integer.parseInt(sc.nextLine()),sc.nextLine());
        }
        Arrays.sort(ds, new ToalComparator());
        for(Employys num:ds){
            System.out.println(num);
        }
    }
}

