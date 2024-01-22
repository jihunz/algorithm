import java.util.ArrayList;
import java.util.Scanner;
import java.util.Stack;

public class Main {
    public static int[] solution(int n, int[] arr) {
        for (int i = 0; i < n - 1; i++) {
            int idx = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[idx]) idx = j;
            }

            int tmp = arr[i];
            arr[i] = arr[idx];
            arr[idx] = tmp;
        }
        return arr;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        for (int x : solution(n, arr)) {
            System.out.print(x + " ");
        }

    }
}