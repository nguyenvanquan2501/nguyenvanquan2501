import java.util.Scanner;

public class J02021 {
    static int N, K;
    static int[] arr;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        K = sc.nextInt();
        arr = new int[K + 1];
        for (int i = 1; i <= K; i++) {
            arr[i] = i;
        }
        int count = 0;
        while (true) {
            printCombination();
            count++;
            int i = K;
            while (i > 0 && arr[i] == N - K + i) i--;
            if (i > 0) {
                arr[i]++;
                for (int j = i + 1; j <= K; j++) {
                    arr[j] = arr[j - 1] + 1;
                }
            } else {
                break;
            }
        }
        System.out.println("\nTong cong co " + count + " to hop");
    }

    public static void printCombination() {
        for (int i = 1; i <= K; i++) {
            System.out.print(arr[i]);
        }
        System.out.print(" ");
    }
}
