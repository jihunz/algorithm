import java.util.ArrayList;
import java.util.Scanner;

public class Main2 {
    static ArrayList<Integer> answer = new ArrayList<>();
    static int max, m = 0;
    public static void dfs(int level, int sum, int[] arr) {
        if (sum > max) return;

        if (level == m) {
            answer.add(sum);
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
        int max = Integer.MIN_VALUE;
        for (Integer i : answer) {
            if (i > max) {
                max = i;
            }
        }

        System.out.println(max);
    }
}