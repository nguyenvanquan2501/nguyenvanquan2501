/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package j05046;

/**
 *
 * @author vanquan
 */
import java.util.*;

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

            // Tính tiền chiết khấu và thành tiền
            double discountRate = 0;
            if (quantity > 10) {
                discountRate = 0.05;
            } else if (quantity >= 8) {
                discountRate = 0.02;
            } else if (quantity >= 5) {
                discountRate = 0.01;
            }
            int discount = (int) (unitPrice * quantity * discountRate);
            int totalPrice = unitPrice * quantity - discount;

            // Tạo mã hàng
            String[] words = productName.split("\\s+"); 
            String productCode = words[0].substring(0, 1).toUpperCase()+words[1].substring(0, 1).toUpperCase();
            productCount.put(productCode, productCount.getOrDefault(productCode, 0) + 1);
            String productID = productCode + String.format("%02d", productCount.get(productCode));

            // In kết quả
            System.out.println(productID + " " + productName + " " + discount + " " + totalPrice);
        }
    }
}
