import java.util.Scanner;

public class Main13 {
    static int[][] map;
    static int answer = 0, n;
    static int[] dx = {-1, -1, 0, 1, 1, 1, 0, -1};
    static int[] dy = {0, 1, 1, 1, 0, -1, -1, -1};

    public static void dfs(int x, int y, int[][] map) {
        for (int i = 0; i < 8; i++) {
            int nx = x + dx[i];
            int ny = y + dy[i];
            if (nx >= 0 && nx < n && ny >= 0 && ny < n && map[nx][ny] == 1) {
                map[nx][ny] = 0;
                dfs(nx, ny, map);
            }
        }
    }

    public static void solution(int[][] map) {
        for (int x = 0; x < n; x++) {
            for (int y = 0; y < n; y++) {
                if (map[x][y] == 1) {
                    answer++;
                    map[x][y] = 0;
                    dfs(x, y, map);
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