import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

class Point3 {
    int x,y;
    public Point3(int x, int y) {
        this.x = x;
        this.y = y;
    }
}

public class Main14 {
    static int[][] map;
    static int answer = 0, n;
    static int[] dx = {-1, -1, 0, 1, 1, 1, 0, -1};
    static int[] dy = {0, 1, 1, 1, 0, -1, -1, -1};

    public static void bfs(int x, int y, int[][] map) {
        Queue<Point3> queue = new LinkedList<>();
        queue.offer(new Point3(x, y));

        while(!queue.isEmpty()) {
            Point3 tmp = queue.poll();
            for (int i = 0; i < 8; i++) {
                int nx = tmp.x + dx[i];
                int ny = tmp.y + dy[i];
                if (nx >= 0 && nx < n && ny >= 0 && ny < n && map[nx][ny] == 1) {
                    map[nx][ny] = 0;
                    queue.offer(new Point3(nx, ny));
                }
            }
        }
    }

    public static void solution(int[][] map) {
        for (int x = 0; x < n; x++) {
            for (int y = 0; y < n; y++) {
                if (map[x][y] == 1) {
                    answer++;
                    map[x][y] = 0;
                    bfs(x, y, map);
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt();
        map = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                map[i][j] = scanner.nextInt();
            }
        }

        solution(map);

        System.out.println(answer);
    }
}