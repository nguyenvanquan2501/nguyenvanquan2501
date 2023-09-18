

import java.util.*;
import java.io.*;

public class J07021 {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("C:\\Users\\vanqu\\OneDrive\\Máy tính\\DATA.in.txt"));
        while (sc.hasNextLine()) {
            String s = sc.nextLine();
            if (s.equals("END")) {
                break;
            }
            String[] words = s.split("\\s+");
            StringBuilder name = new StringBuilder();
            for (String word : words) {
                if (!word.isEmpty()) { // Kiểm tra chuỗi không rỗng
                    name.append(word.substring(0, 1).toUpperCase()).append(word.substring(1).toLowerCase()).append(" ");
                }
            }
            System.out.println(name.toString().trim());
        }
        sc.close();
    }
}
