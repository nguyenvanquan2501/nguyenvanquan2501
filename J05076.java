import java.util.*;

class Product {
    private String codeProduct, nameProduct, rateProduct;
    private double discount;

    public Product(String codeProduct, String nameProduct, String rateProduct) {
        this.codeProduct = codeProduct;
        this.nameProduct = nameProduct;
        this.rateProduct = rateProduct;
        if (rateProduct.equals("A")) {
            this.discount = 0.08;
        } else if (rateProduct.equals("B")) {
            this.discount = 0.05;
        } else {
            this.discount = 0.02;
        }
    }

    public String getCodeProduct() {
        return codeProduct;
    }

    public String getNameProduct() {
        return nameProduct;
    }

    public double getDiscount() {
        return discount;
    }
}

public class J05076 {
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int n = sc.nextInt();
        sc.nextLine();
        Map<String, Product> productMap = new HashMap<>();
        for (int i = 0; i < n; i++) {
            String codeproduct = sc.nextLine();
            String nameproduct = sc.nextLine();
            String rateproduct = sc.nextLine();
            productMap.put(codeproduct, new Product(codeproduct, nameproduct, rateproduct));
        }
        int m = sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < m; i++) {
            String[] transaction = sc.nextLine().split(" ");
            String codeproduct = transaction[0];
            double amount = Double.parseDouble(transaction[1]);
            double unitprice = Double.parseDouble(transaction[2]);
            double amountSell = Double.parseDouble(transaction[3]);

            Product product = productMap.get(codeproduct);
            double totalInputValue = amount * unitprice;
            double totalOutputValue = amountSell * unitprice * (1 + product.getDiscount());

            System.out.println(product.getCodeProduct() + " " + product.getNameProduct() + " " + (int) totalInputValue + " " + (int) totalOutputValue);
        }
    }
}
