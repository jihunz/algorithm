import java.util.Scanner;

public class Main8 {
    static int[] b, p, chk;
    static int n, f;
    static boolean flag = false;
    static int[][] dy = new int[35][35];

    static int combi(int n, int r) {
        if (dy[n][r] > 0) return dy[n][r];
        if (n == r || r == 0) return 1;
        else return dy[n][r] = combi(n - 1, r - 1) + combi(n - 1, r);
    }

    public static void dfs(int level, int sum) {
        if (flag) return;
        if (level == n) {
            if (sum == f) {
                for (int x : p) System.out.print(x + " ");
                flag = true;
            }
        } else {
            for (int i = 1; i <= n; i++) {
                if (chk[i] == 0) {
                    chk[i] = 1;
                    p[level] = i;
                    dfs(level + 1, sum + (p[level] * b[level]));
                    chk[i] = 0;
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt();
        f = scanner.nextInt();
        b = new int[n];
        p = new int[n];
        chk = new int[n + 1];
        for (int i = 0; i < n; i++) {
            b[i] = combi(n - 1, i);
        }
        dfs(0, 0);
    }
}