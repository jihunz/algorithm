import java.util.ArrayList;
import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Scanner;


class Edge3 implements Comparable<Edge3> {
    int vertex, cost;

    public Edge3(int vertex, int cost) {
        this.vertex = vertex;
        this.cost = cost;
    }

    @Override
    public int compareTo(Edge3 param) {
        return this.cost - param.cost;
    }
}

//Prim's algorithm -> 가중치 무방향 그래프의 모든 정점을 최소 비용으로 연결하는 방법을 찾는 알고리즘
public class Main8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int[] chk = new int[n + 1];
        int answer = 0;
        ArrayList<ArrayList<Edge3>> graph = new ArrayList<>();

        // 인접 리스트 생성
        for (int i = 0; i <= n; i++) {
            graph.add(new ArrayList<Edge3>());
        }
        for (int i = 0; i < m; i++) {
            int v1 = scanner.nextInt();
            int v2 = scanner.nextInt();
            int cost = scanner.nextInt();
            // 무방향이기 때문에 두 정점 모두 리스트로 저장
            graph.get(v1).add(new Edge3(v2, cost));
            graph.get(v2).add(new Edge3(v1, cost));
        }

        // PriorityQueue -> cost가 최소인 정점만 고르기 위해 사용
        PriorityQueue<Edge3> pQ = new PriorityQueue<>();
        pQ.offer(new Edge3(1, 0));
        while (!pQ.isEmpty()) {
            Edge3 tmp = pQ.poll();
            int cv = tmp.vertex;
            if (chk[cv] == 0) {
                chk[cv] = 1;
                answer += tmp.cost;

                // 현재와 연결된 정점 중 방문하지 않은 곳만 방문 -> pQ에 저장 -> 반복문이 끝난 뒤 pQ에서 cost가 최소값인 정점만 뽑을 수 있음
                for (Edge3 item : graph.get(cv)) {
                    if (chk[item.vertex] == 0) pQ.offer(new Edge3(item.vertex, item.cost));
                }
            }
        }
        System.out.println(answer);
    }
}
