import java.util.*;

public class J03010 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine().trim());

        Map<String, Integer> emailCount = new HashMap<>();

        for (int i = 0; i < n; i++) {
            String name = sc.nextLine().trim().toLowerCase();
            name = name.replaceAll("\\s+", " "); // Replace multiple spaces with a single space

            String[] parts = name.split(" ");

            StringBuilder email = new StringBuilder();

            for (int j = 0; j < parts.length - 1; j++) {
                email.append(parts[j].charAt(0));
            }
            email.append(parts[parts.length - 1]); // Append the last word in name
            email.append("@ptit.edu.vn");

            String baseEmail = email.toString();

            if (emailCount.containsKey(baseEmail)) {
                int count = emailCount.get(baseEmail) + 1;
                emailCount.put(baseEmail, count);

                email.insert(email.indexOf("@"), count); // Insert the count just before '@'
            } else {
                emailCount.put(baseEmail, 1);
            }

            System.out.println(email);
        }
    }
}
