import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Main5 {
    static int answer = Integer.MAX_VALUE, num, total;

    public static void dfs(int level, int sum, Integer[] arr) {
        if (sum > total || level > answer) return;

        if (sum == total) {
            answer = Math.min(answer, level);
        } else {
            for (int i = 0; i < num; i++) {
                dfs(level + 1, sum + arr[i], arr);
            }
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        num = scanner.nextInt();
        Integer[] arr = new Integer[num];
        for (int i = 0; i < num; i++) {
            arr[i] = scanner.nextInt();
        }
        Arrays.sort(arr, Collections.reverseOrder());
        total = scanner.nextInt();

        dfs(0, 0, arr);
        System.out.println(answer);
    }
}