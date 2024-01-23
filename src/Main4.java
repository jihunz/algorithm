import java.util.Scanner;

public class Main4 {
    public static int[] solution(int size, int b, int[] arr) {
        int[] cache = new int[size];
        for (int x : arr) {
            int pos = -1;
            for (int i = 0; i < size; i++) {
                if (x == cache[i]) pos = i;
            }

            if (pos == -1) {
                for (int i = size - 1; i >= 1; i--) cache[i] = cache[i - 1];
            } else {
                for (int i = pos; i >= 1; i--) cache[i] = cache[i - 1];
            }
            cache[0] = x;
        }
        return cache;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int[] arr = new int[a];
        for (int i = 0; i < a; i++) {
            arr[i] = scanner.nextInt();
        }
        for (int x : solution(a, b, arr)) {
            System.out.print(x + " ");
        }
    }
}