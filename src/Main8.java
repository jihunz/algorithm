import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main8 {

    static int[] dist = {1, -1, 5};
    static int[] visited;
    static Queue<Integer> Q = new LinkedList<>();

    public static int bfs(int s, int e) {
        visited = new int[10001];
        visited[s] = 1;
        Q.offer(s);
        int level = 0;

        while (!Q.isEmpty()) {
            int len = Q.size();

            for (int i = 0; i < len; i++) {
                int curr = Q.poll();

                for (int k : dist) {
                    int child = curr + k;
                    if (child == e) return level + 1;
                    if (child >= 1 && child <= 10000 && visited[child] == 0) {
                        visited[child] = 1;
                        Q.offer(child);
                    }
                }
            }
            level++;
        }
        return 0;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        int b = s.nextInt();
        System.out.println(bfs(a, b));


    }
}