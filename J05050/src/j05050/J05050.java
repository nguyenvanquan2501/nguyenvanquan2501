/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package j05050;

/**
 *
 * @author vanquan
 */
import java.util.*;

class Customer implements Comparable<Customer> {
    private String customerID;
    private String type;
    private int oldIndex, newIndex, coefficient, amount, surcharge, total;

    public Customer(String type, int oldIndex, int newIndex, int id) {
        this.customerID = String.format("KH%02d", id);
        this.type = type;
        this.oldIndex = oldIndex;
        this.newIndex = newIndex;

        // Tính hệ số
        switch (type) {
            case "KD":
                this.coefficient = 3;
                break;
            case "NN":
                this.coefficient = 5;
                break;
            case "TT":
                this.coefficient = 4;
                break;
            case "CN":
                this.coefficient = 2;
                break;
        }

        // Tính thành tiền
        this.amount = (newIndex - oldIndex) * coefficient * 550;

        // Tính phụ trội
        int difference = newIndex - oldIndex;
        if (difference < 50) {
            this.surcharge = 0;
        } else if (difference <= 100) {
            this.surcharge = Math.round(amount * 0.35f);
        } else {
            this.surcharge = amount;
        }

        // Tính tổng tiền
        this.total = amount + surcharge;
    }

    @Override
    public int compareTo(Customer other) {
        return other.total - this.total; // Sắp xếp giảm dần theo tổng tiền phải trả
    }

    @Override
    public String toString() {
        return customerID + " " + coefficient + " " + amount + " " + surcharge + " " + total;
    }
}

public class J05050 {
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int n = sc.nextInt();
        sc.nextLine();  // Consume the newline
        List<Customer> customers = new ArrayList<>();

        for (int i = 1; i <= n; i++) {
            String type = sc.nextLine();
            int oldIndex = sc.nextInt();
            int newIndex = sc.nextInt();
            sc.nextLine();  // Consume the newline
            customers.add(new Customer(type, oldIndex, newIndex, i));
        }

        //Collections.sort(customers); // Sắp xếp danh sách khách hàng

        for (Customer customer : customers) {
            System.out.println(customer);
        }
    }
}

