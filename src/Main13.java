import java.util.ArrayList;
import java.util.Scanner;

public class Main13 {
    static int node, edge, answer = 0;
    static ArrayList<ArrayList<Integer>> graph;
    static int[] chk;


    public static void dfs(int val) {
        if (val == node) answer++;
        else {
            for (int nv : graph.get(val)) {
                if (chk[nv] == 0) {
                    chk[nv] = 1;
                    dfs(nv);
                    chk[nv] = 0;
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        node = scanner.nextInt();
        edge = scanner.nextInt();
        chk = new int[node + 1];

        graph = new ArrayList<>();
        for (int i = 0; i <= node; i++) {
            graph.add(new ArrayList<Integer>());
        }
        for (int i = 0; i < edge; i++) {
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            graph.get(a).add(b);
        }

        chk[1] = 1;
        dfs(1);
        System.out.println(answer);

    }
}