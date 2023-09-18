
/**
 *
 * @author vanquan
 */
import java.util.*;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

class Bill {
    private static int id = 1;
    private String idcustomer, nameCustomer, room, dayin, dayout;
    private int unitprice, amountday, additionalfee, total;

    public Bill(String nameCustomer, String room, String dayin, String dayout, int additionalfee) {
        this.idcustomer = String.format("KH%02d", id++);
        this.nameCustomer = nameCustomer;
        this.room = room;

        // Set unit price based on room type
        if (room.startsWith("1")) {
            this.unitprice = 25;
        } else if (room.startsWith("2")) {
            this.unitprice = 34;
        } else if (room.startsWith("3")) {
            this.unitprice = 50;
        } else {
            this.unitprice = 80;
        }
        this.dayin = dayin.trim();
        this.dayout = dayout.trim();
        DateTimeFormatter timeformat = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate in = LocalDate.parse(dayin, timeformat);
        LocalDate out = LocalDate.parse(dayout, timeformat);
        this.amountday = (int) ChronoUnit.DAYS.between(in, out)+1;

        this.additionalfee = additionalfee;
        this.total = unitprice * amountday + additionalfee;
    }

    public int getTotal() {
        return total;
    }

    @Override
    public String toString() {
        return idcustomer + " " + nameCustomer + " " + room + " " + amountday + " " + total;
    }
}

class TotalComparator implements Comparator<Bill> {
    @Override
    public int compare(Bill a, Bill b) {
        return Integer.compare(b.getTotal(), a.getTotal()); // Reverse order for descending sorting
    }
}

public class J05016 {
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int n = sc.nextInt();
        sc.nextLine();
        Bill[] ds = new Bill[n];
        for (int i = 0; i < n; i++) {
            String name = sc.nextLine();
            String room = sc.nextLine();
            String dayin = sc.nextLine().trim(); 
            String dayout = sc.nextLine().trim(); 
            int additionalfee = sc.nextInt();
            sc.nextLine();
            ds[i] = new Bill(name, room, dayin, dayout, additionalfee);
        }

        Arrays.sort(ds, new TotalComparator());

        for (Bill num : ds) {
            System.out.println(num);
        }
    }
}


