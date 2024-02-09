import java.util.Scanner;

public class Main7 {
    static int[][] mem = new int[34][34];

    public static int dfs(int n, int r) {
        if (mem[n][r] > 0) return mem[n][r];

        if (n == r || r == 0) return 1;
        else {
            return mem[n][r] = dfs(n - 1, r - 1) + dfs(n - 1, r);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int r = scanner.nextInt();
        System.out.println(dfs(n, r));
    }
}