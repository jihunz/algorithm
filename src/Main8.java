import java.util.Scanner;

public class Main8 {
    static int[] b, p, chk;
    static int num, target;
    static boolean flag = false;
    static int[][] dy = new int[35][35];

    static int combi(int n, int r) {
        if (dy[n][r] > 0) return dy[n][r];
        if (n == r || r == 0) return 1;
        else return dy[n][r] = combi(n - 1, r - 1) + combi(n - 1, r);
    }

    public static void dfs(int level, int sum) {
        if (flag) return;
        if (level == num) {
            if (sum == target) {
                for (int x : p) System.out.print(x + " ");
                flag = true;
            }
        } else {
            for (int i = 1; i <= num; i++) {
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
        num = scanner.nextInt();
        target = scanner.nextInt();
        b = new int[num];
        p = new int[num];
        chk = new int[num + 1];
        for (int i = 0; i < num; i++) {
            b[i] = combi(num - 1, i);
        }
        dfs(0, 0);
    }
}