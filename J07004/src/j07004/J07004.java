/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package j07004;

/**
 *
 * @author vanquan
 */
import java.io.*;
import java.util.*;

public class J07004 {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("DATA.in.txt");
        Scanner sc = new Scanner(file);
        Map<String, Integer> map = new HashMap<>();
        
        while (sc.hasNext()) {
            String s = sc.next();
            // Kiểm tra xem khóa đã tồn tại trong map chưa
            if (map.containsKey(s)) {
                // Nếu khóa đã tồn tại, tăng giá trị lên 1
                map.put(s, map.get(s) + 1);
            } else {
                // Nếu khóa chưa tồn tại, khởi tạo giá trị là 1
                map.put(s, 1);
            }
        }
        sc.close();
        
        // In ra kết quả
        for (String key : map.keySet()) {
            System.out.println(key + " " + map.get(key));
        }
    }
}






