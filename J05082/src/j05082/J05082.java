/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package j05082;

/**
 *
 * @author vanquan
 */
import java.util.*;
import java.time.*;
import java.time.format.DateTimeParseException;
import java.time.format.DateTimeFormatter;


class Customer {
    private String idCustomer, nameCustomer, gender, dateOfBirthday, address;
    public static int id = 1;

    public Customer(String nameCustomer, String gender, String dateOfBirthday, String address) {
        this.idCustomer = String.format("KH%03d", id++);
        this.nameCustomer = normalizeNameCustomer(nameCustomer);
        this.gender = gender;
        this.dateOfBirthday = normalizeDateOfBirthday(dateOfBirthday);
        this.address = address.trim();
    }

    public String normalizeNameCustomer(String nameCustomer) {
        String[] words = nameCustomer.trim().split("\\s+");
        StringBuilder res = new StringBuilder();
        for (String word : words) {
            res.append(word.substring(0, 1).toUpperCase()).append(word.substring(1).toLowerCase()).append(" ");
        }
        return res.toString().trim();
    }

    public String normalizeDateOfBirthday(String dateOfBirthday) {
        DateTimeFormatter inputTimeFormatter = DateTimeFormatter.ofPattern("d/M/yyyy");
        DateTimeFormatter outputFormatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        try {
            LocalDate parsedDate = LocalDate.parse(dateOfBirthday, inputTimeFormatter);
            return parsedDate.format(outputFormatter);
        } catch (DateTimeParseException e) {
            return dateOfBirthday; // Trả về ngày sinh gốc nếu không thể phân tích
        }
    }

    public String getDateOfBirthday() {
        return dateOfBirthday;
    }

    @Override
    public String toString() {
        return idCustomer + " " + nameCustomer + " " + gender + " " + address + " " + dateOfBirthday;
    }
}

class BirthDayComparator implements Comparator<Customer> {
    public int compare(Customer a, Customer b) {
        return b.getDateOfBirthday().compareTo(a.getDateOfBirthday()); // Sắp xếp từ già đến trẻ
    }
}

public class J05082 {
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int n = sc.nextInt();
        sc.nextLine();
        Customer[] ds = new Customer[n];
        for (int i = 0; i < n; i++) {
            String name = sc.nextLine();
            String gender = sc.nextLine();
            String date = sc.nextLine();
            String address = sc.nextLine();
            ds[i] = new Customer(name, gender, date, address);
        }
        Arrays.sort(ds, new BirthDayComparator());
        for (Customer num : ds) {
            System.out.println(num);
        }
    }
}


