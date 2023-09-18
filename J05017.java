import java.util.*;
class UltilityBill{
    private String idCustomer,nameCustomer;
    public static int id = 1;
    private int unitprice,previosindex,subsequntindex;
    private double additionalfee,totalBill;
    public UltilityBill(String nameCustomer,int previosindex,int subsequntindex){
        this.idCustomer=String.format("KH%02d",id++);
        if(subsequntindex-previosindex<50){
            this.unitprice=100;
            //this.additionalfee=0.02;
            this.totalBill=unitprice*(subsequntindex-previosindex)*(1.02);
        }else if(subsequntindex-previosindex<100 && subsequntindex-previosindex>50){
            this.unitprice=150;
            //this.additionalfee=0.03;
            this.totalBill=unitprice*(subsequntindex-previosindex)*(1.03);
        }else {
            this.unitprice=200;
            //this.additionalfee=0.05;
            this.totalBill=unitprice*(subsequntindex-previosindex)*(1.05);
        }
    }
    public double getTotalBill(){
        return totalBill;
    }
    @Override
    public String toString(){
        return idCustomer+" "+nameCustomer+" "+totalBill;
    }
}
class TotalBillComparator implements Comparator<UltilityBill>{
    public int compate (UltilityBill a, UltilityBill b){
        return Double.compare(a.getTotalBill(), b.getTotalBill());
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
    }
}
