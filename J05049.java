

/**
 *
 * @author vanquan
 */


/**
 *
 * @author vanquan
 */


/**
 *
 * @author vanquan
 */
import java.util.*;
class Product{
    private String ID;
    private int quanlity,unitPrice,quantityOfSell,excise,totalMoney;
    public Product(String ID, int quanlity){
        this.ID=ID;
        this.quanlity=quanlity;
        if(ID.substring(0,1).equals("A")){
            this.quantityOfSell=(int)Math.round(quanlity*0.6);
        }else {
            this.quantityOfSell=(int)Math.round(quanlity*0.7);
        }
        if (ID.charAt(4) == 'Y') {
            this.unitPrice = 110000;
        } else {
            this.unitPrice = 135000;
        }
        
        // Tính tiền
        this.totalMoney = unitPrice * quantityOfSell;
        
        // Tính thuế
        if (ID.charAt(0) == 'A' && ID.charAt(4) == 'Y') {
            this.excise = (int) (0.08 * totalMoney);
        } else if (ID.charAt(0) == 'A' && ID.charAt(4) == 'N') {
            this.excise = (int) (0.11 * totalMoney);
        } else if (ID.charAt(0) == 'B' && ID.charAt(4) == 'Y') {
            this.excise = (int) (0.17 * totalMoney);
        } else {
            this.excise = (int) (0.22 * totalMoney);
        }
    }
    public String getID(){
        return ID;
    }
    public int getExcise(){
        return excise;
    }
    @Override
    public String toString(){
        return ID+" "+quanlity+" "+quantityOfSell+" "+unitPrice+" "+totalMoney+" "+excise;
    }
}
class ExciseCompartor implements Comparator<Product>{
    @Override
    public int compare(Product a, Product b){
        return Integer.compare(b.getExcise(),a.getExcise());
    }
}
public class J05049 {
    public static Scanner sc = new Scanner(System.in);
    public static void main(String[]args){
        int n = sc.nextInt();
        sc.nextLine();
        Product[] ds = new Product[n];
        for(int i = 0;i<n;i++){
            String ID = sc.nextLine();
            int quanlity = Integer.parseInt(sc.nextLine());
            ds[i]=new Product(ID,quanlity); 
        }
        Arrays.sort(ds,new ExciseCompartor());
        String name = sc.nextLine();
        for(int i=0;i<n;i++){
           if(ds[i].getID().substring(0,1).equals(name)){
                System.out.println(ds[i]); 
           }
        }
    }
}



