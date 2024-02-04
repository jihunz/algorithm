import java.util.Scanner;

public class Main {
    static String answer = "NO";
    static int n, total = 0;
    static boolean flag = false;

    public static void dfs(int level, int sum, int[] arr) {
        if (flag) return;
        if (sum > total) return;

        if (level == n) {
            if ((total-sum) == sum) {
                answer = "YES";
                flag = true;
            }
        } else {
            dfs(level+1, sum+arr[level], arr);
            dfs(level+1, sum, arr);
        }

    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt();
        int[] arr = new int[n];
        for (int i=0; i<n; i++) {
            arr[i] = scanner.nextInt();
            total += arr[i];
        }

        dfs(0, 0, arr);
        System.out.println(answer);
    }
}