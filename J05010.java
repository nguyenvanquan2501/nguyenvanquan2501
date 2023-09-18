import java.util.*;

class Product{
    private String ID,Nameproduct,Typeproduct;
    private double buyprice, sellprice,profit;
    public int id = 1;
    public Product(String Nameproduct,String Typeproduct,double buyprice,double sellprice){
        this.ID=Integer.toString(id);
        this.Nameproduct=Nameproduct;
        this.buyprice=buyprice;
        this.sellprice=sellprice;
    }
    public double getProfit(){
        return this.profit=sellprice-buyprice;
    }
    @Override
    public String toString(){
        return ID+" "+Nameproduct+" "+Typeproduct+" "+String.format("%.2f", getProfit());
    }
}
class ProfitComparator implements Comparator<Product>{
     @Override
    public int compare(Product p1, Product p2) {
        return Double.compare(p1.getProfit(), p2.getProfit()); // Sắp xếp từ cao đến thấp
    }
}
public class J05010 {
    public static Scanner sc = new Scanner(System.in);
    public static void main(String[]args){
        int n = sc.nextInt();
        sc.nextLine();
        Product[] ds = new Product[n];
        for(int i=0;i<n;i++){
            ds[i] = new Product(sc.nextLine(),sc.nextLine(), Double.parseDouble(sc.nextLine()),Double.parseDouble(sc.nextLine()));
        }
        Arrays.sort(ds,new ProfitComparator());
        for(Product num : ds){
            System.out.println(num);
        }
    }
}
