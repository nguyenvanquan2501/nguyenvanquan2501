import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class J02005 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();

        Set<Integer> setA = new TreeSet<>();
        Set<Integer> setB = new TreeSet<>();

        for (int i = 0; i < n; i++) {
            setA.add(scanner.nextInt());
        }

        for (int i = 0; i < m; i++) {
            setB.add(scanner.nextInt());
        }

        setA.retainAll(setB); // Lấy tập giao của A và B

        for (int num : setA) {
            System.out.print(num + " ");
        }
    }
}
