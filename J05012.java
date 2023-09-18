

/**
 *
 * @author vanquan
 */
import java.util.*;

class Product {
    private String codeProduct, nameProduct;
    private int amount;
    private long unitprice, discount, total; // Sử dụng kiểu long

    public Product(String codeProduct, String nameProduct, int amount, long unitprice, long discount) {
        this.codeProduct = codeProduct;
        this.nameProduct = nameProduct;
        this.amount = amount;
        this.unitprice = unitprice;
        this.discount = discount;
        this.total = unitprice * amount - discount;
    }

    public long getTotal() { // Sử dụng kiểu long
        return total;
    }

    @Override
    public String toString() {
        return codeProduct + " " + nameProduct + " " + amount + " " + unitprice + " " + discount + " " + total;
    }
}

class TotalComparator implements Comparator<Product> {
    public int compare(Product a, Product b) {
        return Long.compare(b.getTotal(), a.getTotal()); // Sử dụng Long.compare
    }
}

public class J05012 {
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int n = sc.nextInt();
        sc.nextLine();
        Product[] ds = new Product[n];
        for (int i = 0; i < n; i++) {
            String codeproduct = sc.nextLine();
            String nameproduct = sc.nextLine();
            int amount = Integer.parseInt(sc.nextLine());
            long unitprice = Long.parseLong(sc.nextLine()); // Sử dụng Long.parseLong
            long discount = Long.parseLong(sc.nextLine()); // Sử dụng Long.parseLong
            ds[i] = new Product(codeproduct, nameproduct, amount, unitprice, discount);
        }
        Arrays.sort(ds, new TotalComparator());
        for (Product num : ds) {
            System.out.println(num);
        }
    }
}



