import java.util.Scanner;
import java.util.Formatter;

public class J01005 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt();
        
        while (T-- > 0) {
            int N = scanner.nextInt();
            int H = scanner.nextInt();
            
            for (int i = 1; i < N; i++) {
                double x = H * Math.sqrt((double) i / N);
                System.out.print(new Formatter().format("%.6f", x) + " ");
            }
            System.out.println();
        }
    }
}
