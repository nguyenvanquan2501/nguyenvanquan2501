/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package j05028;

/**
 *
 * @author vanquan
 */
import java.util.*;
class Company{
    private String ID,Name;
    private int Number;
    public Company(String ID,String Name, int Number){
        this.ID=ID;
        this.Name=Name;
        this.Number=Number;
    }
    public String getID(){
        return ID;
    }
    public int getNumber(){
        return Number;
    }
    @Override
    public String toString(){
        return ID +" "+Name+" "+Number;
    }
}
class NumberComparator implements Comparator<Company> {
    @Override
    public int compare(Company a, Company b) {
        if (a.getNumber() == b.getNumber()) {
            return a.getID().compareTo(b.getID()); // Sắp xếp theo mã doanh nghiệp nếu số lượng giống nhau
        }
        return Integer.compare(b.getNumber(), a.getNumber());
    }
}


public class J05028 {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        Company[] ds = new Company[n];
        for(int i=0;i<n;i++){
            ds[i] = new Company(sc.nextLine(),sc.nextLine(),Integer.parseInt(sc.nextLine()));
        }
        Arrays.sort(ds,new NumberComparator());
        for(Company num : ds){
            System.out.println(num);
        }
    }
}
