import java.util.Scanner;

public class J02020 {
    public static int k = 0;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int K = scanner.nextInt();
        scanner.close();

        int[] combination = new int[K];
        generateCombinations(N, K, combination, 1, 0);
        System.out.print("Tong cong co " + k + " to hop");
    }

    public static void generateCombinations(int N, int K, int[] combination, int start, int index) {
        if (index == K) {
            for (int num : combination) {
                System.out.print(num + " ");
            }
            k++;
            System.out.println();
            return;
        }

        for (int i = start; i <= N; i++) {
            combination[index] = i;
            generateCombinations(N, K, combination, i + 1, index + 1);
        }
        
    }
}
