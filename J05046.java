import java.util.*;

class Product {
    private String productName;
    private int quantity;
    private int unitPrice;
    private int discount;
    private int totalPrice;
    private String productID;

    public Product(String productName, int quantity, int unitPrice, Map<String, Integer> productCount) {
        this.productName = productName;
        this.quantity = quantity;
        this.unitPrice = unitPrice;

        // Tính tiền chiết khấu và thành tiền
        double discountRate = 0;
        if (quantity > 10) {
            discountRate = 0.05;
        } else if (quantity >= 8) {
            discountRate = 0.02;
        } else if (quantity >= 5) {
            discountRate = 0.01;
        }
        this.discount = (int) (unitPrice * quantity * discountRate);
        this.totalPrice = unitPrice * quantity - discount;

        // Tạo mã hàng
        String[] words = productName.split("\\s+");
        String productCode = words[0].substring(0, 1).toUpperCase() + words[1].substring(0, 1).toUpperCase();
        productCount.put(productCode, productCount.getOrDefault(productCode, 0) + 1);
        this.productID = productCode + String.format("%02d", productCount.get(productCode));
    }

    @Override
    public String toString() {
        return productID + " " + productName + " " + discount + " " + totalPrice;
    }
}

public class J05046 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine(); // Đọc dòng trống sau số lượng lô hàng

        // Sử dụng HashMap để lưu trữ số thứ tự của mỗi loại hàng
        Map<String, Integer> productCount = new HashMap<>();

        for (int i = 0; i < n; i++) {
            String productName = sc.nextLine();
            int quantity = sc.nextInt();
            int unitPrice = sc.nextInt();
            sc.nextLine(); // Đọc dòng trống sau đơn giá

            Product product = new Product(productName, quantity, unitPrice, productCount);
            System.out.println(product);
        }
    }
}
