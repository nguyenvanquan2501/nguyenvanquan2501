/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package j05068;

import java.util.*;
import java.util.Scanner;

public class J05068 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        Goods[] ds = new Goods[n];
        for(int i=0;i<n;i++) {
            String input = sc.nextLine();
            String[] parts = input.split(" ");
            String code = parts[0];
            int mount = Integer.parseInt(parts[1]);  // Use the second part as the mount
            ds[i] = new Goods(code, mount);
        }
        Arrays.sort(ds,new TotalpriceComparator());
        for(Goods num : ds){
              System.out.println(num);
        }
    }
}

class TotalpriceComparator implements Comparator<Goods> {
    @Override
    public int compare(Goods a, Goods b) {  // Fixed the method name here
        return Long.compare(b.getTotal(), a.getTotal());  // Fixed the comparison to use long
    }
}
class Goods {
    private String codeGoods, manufacturer;
    private long price, total, totalexcise;

    public Goods(String codeGoods, int mount) {
        this.codeGoods = codeGoods;
        if (codeGoods.startsWith("X")) {
            this.price = 128000;
            this.totalexcise = Math.round(0.03 * price * mount);
        } else if (codeGoods.startsWith("D")) {
            this.price = 11200;
            this.totalexcise = Math.round(0.035 * price * mount);
        } else {
            this.price = 9700;
            this.totalexcise = Math.round(0.02 * price * mount);
        }

        String subCode = codeGoods.substring(codeGoods.length() - 2);
        if (subCode.equals("BP")) {
            this.manufacturer = "British Petro";
        } else if (subCode.equals("ES")) {
            this.manufacturer = "Esso";
        } else if (subCode.equals("SH")) {
            this.manufacturer = "Shell";
        } else if (subCode.equals("CA")) {
            this.manufacturer = "Castrol";
        } else if (subCode.equals("MO")) {
            this.manufacturer = "Mobil";
        } else {
            this.manufacturer = "Trong Nuoc";
            this.totalexcise = 0;
        }
        this.total = price * mount + totalexcise;
    }

      public long getTotal() {
            return total;
      }
    
    @Override
    public String toString() {
        return codeGoods + " " + manufacturer + " " + price + " " + totalexcise + " " + total;
    }
}
