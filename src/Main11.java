import java.util.Scanner;

public class Main11 {
    static int node, edge, answer = 0;
    static int[][] graph;
    static int[] chk;


    public static void dfs(int val) {
        if (val == node) answer++;
        else {
            for (int i = 1; i <= node; i++) {
                if (graph[val][i] == 1 && chk[i] == 0) {
                    chk[i] = 1;
                    dfs(i);
                    chk[i] = 0;
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        node = scanner.nextInt();
        edge = scanner.nextInt();
        graph = new int[node + 1][node + 1];
        chk = new int[node + 1];

        for (int i = 0; i < edge; i++) {
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            graph[a][b] = 1;
        }

        chk[1] = 1;
        dfs(1);
        System.out.println(answer);
    }
}