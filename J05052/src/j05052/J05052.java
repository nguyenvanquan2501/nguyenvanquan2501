/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package j05052;

/**
 *
 * @author vanquan
 */
import java.util.*;
class Product{
    private String nameProduct,codeProduct,stt;
    private int unitPrice,amount,discount,total,money;
    public Product(String nameProduct,String codeProduct, int unitPrice,int amount){
        this.nameProduct=nameProduct;
        this.codeProduct=codeProduct;
        this.stt= codeProduct.substring(1,4);
        this.unitPrice=unitPrice;
        this.money=unitPrice*amount;
        if(codeProduct.substring(4).equals("1")){
            this.discount=(int)(0.5*unitPrice*amount);
        }else{
            this.discount=(int)(0.3*unitPrice*amount);
        }
        this.total=money-discount;
    }
    @Override
    public String toString(){
        return nameProduct+" "+codeProduct+" "+stt+" "+discount+" "+total;
    }
}
public class J05052 {
    public static Scanner sc = new Scanner(System.in);
    public static void main(String[]args){
        int n= sc.nextInt();
        sc.nextLine();
        for(int i=0;i<n;i++){
            String name = sc.nextLine();
            String code = sc.nextLine();
            int unitprice = Integer.parseInt(sc.nextLine());
            int amount = Integer.parseInt(sc.nextLine());
            Product product  = new Product(name, code, unitprice, amount);
            System.out.println(product);
        }
    }
}


