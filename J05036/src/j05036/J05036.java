/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package j05036;

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
        this.SellPrice=Total*102/100;
        this.ID=String.format("MH%02d",id++);
    }
    @Override
    public String toString(){
        return ID+" "+NameOfProduct+" "+Measure+" "+Math.round(Carrige)+" "+Math.round(Total)+" "+Math.round(SellPrice);
    }

}
public class J05036 {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        for(int i=0;i<n;i++){
            Product product = new Product(sc.nextLine(),sc.nextLine(),Double.parseDouble(sc.nextLine()),Double.parseDouble(sc.nextLine()));
            System.out.println(product);
        }
    }
}
