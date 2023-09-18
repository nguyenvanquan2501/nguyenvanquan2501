import java.util.*;

public class J02017 {
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        Stack<Integer> st = new Stack<>();
        for (int i = 0; i < n; i++) {
            if (!st.isEmpty() && (st.peek() + arr[i]) % 2 == 0) {
                st.pop();
            } else {
                st.push(arr[i]);
            }
        }

        int k = st.size();
        System.out.println(k);
    }
}
