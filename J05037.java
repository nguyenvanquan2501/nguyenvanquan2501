
/**
 *
 * @author vanquan
 */
import java.util.*;
class Product{
    private String ID,NameOfProduct,Measure;
    public static int id=1;
    private double BuyPrice,SellPrice,Carrige,Total,Amount;
    /**BuyPrice: don gia nhap
     * Carrige = (BuyPrice * Amount)*5/100;
     * Total = (BuyPrice*Amount)*105/100;
     * SellPrice = Total*102/100;
     * */
    public Product(String NameOfProduct, String Measure,double BuyPrice,double Amount){
        this.NameOfProduct=NameOfProduct;
        this.Amount=Amount;
        this.BuyPrice=BuyPrice;
        this.Measure=Measure;
        this.Carrige=(BuyPrice * Amount)*5/100;
        this.Total=(BuyPrice*Amount)*105/100;
        this.SellPrice=(Total*102/100)/Amount;
        this.ID=String.format("MH%02d",id++);
    }
    public double getSellPrice(){
        return SellPrice;
    }
    @Override
    public String toString(){
        return ID+" "+NameOfProduct+" "+Measure+" "+Math.round(Carrige)+" "+Math.round(Total)+" "+Math.round(SellPrice);
    }

}
class SellPriceComparator implements Comparator<Product>{
    public int compare(Product a, Product b){
        return Double.compare(a.getSellPrice(), b.getSellPrice());
    }
}
public class J05037 {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        Product[] ds = new Product[n];
        for(int i=0;i<n;i++){
            ds[i] = new Product(sc.nextLine(),sc.nextLine(),Double.parseDouble(sc.nextLine()),Double.parseDouble(sc.nextLine()));
        }
        Arrays.sort(ds, new SellPriceComparator());
        for(Product num : ds){
            System.out.println(num);
        }
    }
}
