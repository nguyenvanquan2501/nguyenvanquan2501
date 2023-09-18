import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.Scanner;

public class J05082 {
    public static class Customer implements Comparable<Customer> {
        String name;
        String gender;
        Date dob;
        String address;

        public Customer(String name, String gender, Date dob, String address) {
            this.name = name;
            this.gender = gender;
            this.dob = dob;
            this.address = address;
        }

        @Override
        public int compareTo(Customer other) {
            return other.dob.compareTo(this.dob); // Sort in descending order of dob
        }

        public String standardizeName(String name) {
            String[] words = name.trim().split("\\s+");
            StringBuilder sb = new StringBuilder();
            for (String word : words) {
                sb.append(Character.toUpperCase(word.charAt(0)));
                sb.append(word.substring(1).toLowerCase()).append(" ");
            }
            return sb.toString().trim();
        }

        @Override
        public String toString() {
            SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
            return String.format("%s %s %s %s %s", name, gender, address, sdf.format(dob));
        }
    }

    public static void main(String[] args) throws ParseException {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        sc.nextLine(); // Consume newline

        ArrayList<Customer> customers = new ArrayList<>();
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        for (int i = 0; i < N; i++) {
            String name = sc.nextLine().trim();
            String gender = sc.nextLine().trim();
            Date dob = sdf.parse(sc.nextLine().trim());
            String address = sc.nextLine().trim();

            customers.add(new Customer(name, gender, dob, address));
        }

        Collections.sort(customers);

        for (int i = 0; i < N; i++) {
            System.out.println("KH" + String.format("%03d", i + 1) + " " + customers.get(i));
        }
    }
}
