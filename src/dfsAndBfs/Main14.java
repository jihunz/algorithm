package dfsAndBfs;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main14 {
    static int node, edge, answer = 0;
    static ArrayList<ArrayList<Integer>> graph;
    static int[] chk;
    static int[] dis;


    public static void bfs(int v) {
        chk[v] = 1;
        dis[v] = 0;
        Queue<Integer> queue = new LinkedList<>();
        queue.offer(v);
        while (!queue.isEmpty()) {
            int cv = queue.poll();
            for (int nv : graph.get(cv)) {
                if (chk[nv] == 0) {
                    chk[nv] = 1;
                    queue.offer(nv);
                    dis[nv] = dis[cv] + 1;
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        node = scanner.nextInt();
        edge = scanner.nextInt();
        chk = new int[node + 1];
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

        bfs(1);

        for (int i = 2; i <= node; i++) {
            System.out.println(i + " : " + dis[i]);
        }

    }
}