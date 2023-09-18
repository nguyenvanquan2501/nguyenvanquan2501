import java.util.*;

public class J02007 {
    public static Scanner sc = new Scanner(System.in);
    public static int k = 1;

    public static void test() {
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        Map<Integer, Integer> sum = new HashMap<>();
        List<Integer> order = new ArrayList<>(); // Danh sách lưu trữ thứ tự xuất hiện của các phần tử

        for (int num : a) {
            if (sum.containsKey(num)) {
                sum.put(num, sum.get(num) + 1);
            } else {
                sum.put(num, 1);
                order.add(num); // Thêm phần tử vào danh sách thứ tự xuất hiện
            }
        }

        System.out.println("Test " + k + ":");
        
        // Duyệt qua danh sách thứ tự xuất hiện để in ra các khóa theo thứ tự
        for (int num : order) {
            System.out.println(num + " xuat hien " + sum.get(num) + " lan");
        }
        
        k++;
    }

    public static void main(String[] args) {
        int t = sc.nextInt();
        while (t-- > 0) {
            test();
        }
    }
}
