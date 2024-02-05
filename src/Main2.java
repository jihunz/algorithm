import java.util.ArrayList;
import java.util.Scanner;

public class Main2 {
    static int answer = Integer.MIN_VALUE, max, m;
    public static void dfs(int level, int sum, int[] arr) {
        if (sum > max) return;

        if (level == m) {
            if (sum > answer) answer =sum;
        } else {
            dfs(level + 1, sum + arr[level], arr);
            dfs(level + 1, sum, arr);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        max = scanner.nextInt();
        m = scanner.nextInt();
        int[] arr = new int[m];
        for (int i = 0; i < m; i++) {
            arr[i] = scanner.nextInt();
        }

        dfs(0, 0, arr);
        System.out.println(answer);
    }
}