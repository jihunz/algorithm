package greedyAlgorithm;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

class Edge2 implements Comparable<Edge2> {
    int v1, v2, cost;

    public Edge2(int v1, int v2, int cost) {
        this.v1 = v1;
        this.v2 = v2;
        this.cost = cost;
    }

    @Override
    public int compareTo(Edge2 param) {
        return this.cost - param.cost;
    }
}


//모든 정점 최소 비용으로 연결
public class Main7 {
    static int[] arr;

    public static void main(String[] args) {
        int answer = 0;
        Scanner scanner = new Scanner(System.in);
        int vertex = scanner.nextInt();
        int line = scanner.nextInt();
        arr = new int[vertex + 1];
        ArrayList<Edge2> list = new ArrayList<>();

        for (int i = 1; i <= vertex; i++) arr[i] = i;

        for (int i = 0; i < line; i++) {
            int v1 = scanner.nextInt();
            int v2 = scanner.nextInt();
            int cost = scanner.nextInt();
            list.add(new Edge2(v1, v2, cost));
        }

        Collections.sort(list);
        for (Edge2 item : list) {
            int set1 = Find(item.v1);
            int set2 = Find(item.v2);
            // Find -> 두 집합값이 다를때만 cost 누적 -> 합집합에 추가
            if (set1 != set2) {
                answer += item.cost;
                Union(item.v1, item.v2);
            }
        }

        System.out.println(answer);
    }

    private static void Union(int v1, int v2) {
        int set1 = Find(v1);
        int set2 = Find(v2);
        if (set1 != set2) arr[set1] = set2;
    }

    private static int Find(int val) {
        if (val == arr[val]) return val;
        else return arr[val] = Find(arr[val]);
    }
}
