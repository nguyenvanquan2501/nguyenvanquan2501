import java.util.*;

class Customer {
    private static int customerCounter = 1;
    private String idCustomer, name, gender, birthday, address;

    public Customer(String name, String gender, String birthday, String address) {
        this.idCustomer = String.format("KH%03d", customerCounter++);
        this.name = name;
        this.gender = gender;
        this.birthday = birthday;
        this.address = address;
    }

    @Override
    public String toString() {
        return idCustomer + " " + name + " " + gender + " " + birthday + " " + address;
    }
}

class Item {
    private static int itemCounter = 1;
    private String idItem, name, unit;
    private int purchasePrice, sellingPrice;

    public Item(String name, String unit, int purchasePrice, int sellingPrice) {
        this.idItem = String.format("MH%03d", itemCounter++);
        this.name = name;
        this.unit = unit;
        this.purchasePrice = purchasePrice;
        this.sellingPrice = sellingPrice;
    }

    @Override
    public String toString() {
        return idItem + " " + name + " " + unit + " " + purchasePrice + " " + sellingPrice;
    }
}

class Invoice {
    private static int invoiceCounter = 1;
    private String idInvoice;
    private Customer customer;
    private Item item;
    private int quantity;

    public Invoice(Customer customer, Item item, int quantity) {
        this.idInvoice = String.format("HD%03d", invoiceCounter++);
        this.customer = customer;
        this.item = item;
        this.quantity = quantity;
    }

    public int getTotal() {
        return item.sellingPrice * quantity;
    }

    @Override
    public String toString() {
        return idInvoice + " " + customer.name + " " + customer.address + " " +
                item.name + " " + item.unit + " " + item.purchasePrice + " " +
                item.sellingPrice + " " + quantity + " " + getTotal();
    }
}

public class J06005 {
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int n = sc.nextInt();
        sc.nextLine(); // Đọc dòng kết thúc sau số khách hàng

        Customer[] customers = new Customer[n];

        for (int i = 0; i < n; i++) {
            String name = sc.nextLine();
            String gender = sc.nextLine();
            String birthday = sc.nextLine();
            String address = sc.nextLine();

            customers[i] = new Customer(name, gender, birthday, address);
        }

        int m = sc.nextInt();
        sc.nextLine(); // Đọc dòng kết thúc sau số mặt hàng

        Item[] items = new Item[m];

        for (int i = 0; i < m; i++) {
            String name = sc.nextLine();
            String unit = sc.nextLine();
            int purchasePrice = sc.nextInt();
            int sellingPrice = sc.nextInt();
            sc.nextLine(); // Đọc dòng kết thúc sau giá bán

            items[i] = new Item(name, unit, purchasePrice, sellingPrice);
        }

        int k = sc.nextInt();
        sc.nextLine(); // Đọc dòng kết thúc sau số hóa đơn

        Invoice[] invoices = new Invoice[k];

        for (int i = 0; i < k; i++) {
            String customerId = sc.next();
            String itemId = sc.next();
            int quantity = sc.nextInt();
            sc.nextLine(); // Đọc dòng kết thúc sau số lượng

            Customer customer = findCustomer(customers, customerId);
            Item item = findItem(items, itemId);

            invoices[i] = new Invoice(customer, item, quantity);
        }

        for (Invoice invoice : invoices) {
            System.out.println(invoice);
        }
    }

    private static Customer findCustomer(Customer[] customers, String id) {
        for (Customer customer : customers) {
            if (customer.idCustomer.equals(id)) {
                return customer;
            }
        }
        return null;
    }

    private static Item findItem(Item[] items, String id) {
        for (Item item : items) {
            if (item.idItem.equals(id)) {
                return item;
            }
        }
        return null;
    }
}
