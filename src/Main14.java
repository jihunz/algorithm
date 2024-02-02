import java.util.ArrayList;
import java.util.Scanner;

public class Main14 {
    static int node, edge, answer = 0;
    static ArrayList<ArrayList<Integer>> graph;
    static int[] dis;


    public static void dfs(int val) {
        if (val == node) answer++;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        node = scanner.nextInt();
        edge = scanner.nextInt();
        dis = new int[node + 1];

        graph = new ArrayList<>();
        for (int i = 0; i <= node; i++) {
            graph.add(new ArrayList<Integer>());
        }
        for (int i = 0; i < edge; i++) {
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            graph.get(a).add(b);
        }

        dfs(1);

        for (int i = 2; i <= node; i++) {
            System.out.println(i + " : " + dis[i]);
        }

    }
}