/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package j05017;

/**
 *
 * @author vanquan
 */
import java.util.*;
class UltilityBill{
    private String idCustomer,nameCustomer;
    public static int id = 1;
    private int unitprice,previosindex,subsequntindex;
    private double additionalfee,totalBill;
    public UltilityBill(String nameCustomer,int previosindex,int subsequntindex){
        this.idCustomer=String.format("KH%02d",id++);
        this.nameCustomer=nameCustomer;
        if(subsequntindex-previosindex<50){
            this.unitprice=100;
            //this.additionalfee=0.02;
            this.totalBill=(int)unitprice*(subsequntindex-previosindex)*(1.02);
        }else if(subsequntindex-previosindex<100 && subsequntindex-previosindex>50){
            this.unitprice=150;
            //this.additionalfee=0.03;
            this.totalBill=(int)unitprice*(subsequntindex-previosindex)*(1.03);
        }else {
            this.unitprice=200;
            //this.additionalfee=0.05;
            this.totalBill=(int)unitprice*(subsequntindex-previosindex)*(1.05);
        }
    }
    public double getTotalBill(){
        return totalBill;
    }
    @Override
    public String toString(){
        return idCustomer+" "+nameCustomer+" "+(int)totalBill;
    }
}
class TotalBillComparator implements Comparator<UltilityBill>{
    @Override
    public int compare (UltilityBill a, UltilityBill b){
        return Double.compare(b.getTotalBill(), a.getTotalBill());
    }
}
public class J05017 {
    public static Scanner sc = new Scanner(System.in);
    public static void main(String[]args){
        int n = sc.nextInt();
        sc.nextLine();
        UltilityBill[] ds = new UltilityBill[n];
        for(int i=0;i<n;i++){
            String name = sc.nextLine();
            int previosindex = Integer.parseInt(sc.nextLine());
            int subsequntindex = Integer.parseInt(sc.nextLine());
            ds[i] = new UltilityBill(name, previosindex, subsequntindex);
        }
        Arrays.sort(ds,new TotalBillComparator());
        for(UltilityBill num : ds){
            System.out.println(num);
        }
    }
}

