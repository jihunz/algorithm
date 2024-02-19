import java.util.*;

class Edge implements Comparable<Edge> {
    int vertex, cost;

    public Edge(int vertex, int cost) {
        this.vertex = vertex;
        this.cost = cost;
    }

    @Override
    public int compareTo(Edge param) {
        return this.cost - param.cost;
    }
}



public class Main5 {
    static int n, m;
    static ArrayList<ArrayList<Edge>> graph;
    static int[] dis;


    static void solution(int vertex) {
        PriorityQueue<Edge> pQ = new PriorityQueue<>();
        pQ.offer(new Edge(vertex, 0));
        dis[vertex] = 0;

        while(!pQ.isEmpty()) {
            Edge tmp = pQ.poll();
            int now = tmp.vertex;
            int nowCost = tmp.cost;
            if (nowCost > dis[now]) continue;

            for (Edge item : graph.get(now)) {
                if (dis[item.vertex] > nowCost + item.cost) {
                    dis[item.vertex] = nowCost + item.cost;
                    pQ.offer(new Edge(item.vertex, nowCost + item.cost));
                }
            }

        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt();
        m = scanner.nextInt();
        graph = new ArrayList<ArrayList<Edge>>();
        for (int i = 0; i <= n; i++) {
            graph.add(new ArrayList<Edge>());
        }

        dis = new int[n+1];
        Arrays.fill(dis, Integer.MAX_VALUE);

        for (int i = 2; i <= n; i++) {
            int a = scanner.nextInt();
            int vertex = scanner.nextInt();
            int cost = scanner.nextInt();
            graph.get(a).add(new Edge(vertex, cost));
        }

        solution(1);
        for (int i = 2; i <= n; i++) {
            if (dis[i] != Integer.MAX_VALUE) System.out.println(i + " : " + dis[i]);
            else System.out.println(i + " : impossible");

        }

    }
}
