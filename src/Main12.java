import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

class Point2 {
    public int x, y;

    Point2(int x, int y) {
        this.x = x;
        this.y = y;
    }
}

public class Main12 {

    static int[][] box;
    static int[][] elapsed;
    static int row, col;
    static int[] dx = {-1, 0, 1, 0};
    static int[] dy = {0, 1, 0, -1};
    static Queue<Point2> queue = new LinkedList<>();

    public static void bfs() {
        while (!queue.isEmpty()) {
            Point2 tmp = queue.poll();
            for (int i = 0; i < 4; i++) {
                int nx = tmp.x + dx[i];
                int ny = tmp.y + dy[i];
                if (nx >= 0 && nx < row && ny >= 0 && ny < col && box[nx][ny] == 0) {
                    box[nx][ny] = 1;
                    queue.offer(new Point2(nx, ny));
                    elapsed[nx][ny] = elapsed[tmp.x][tmp.y] + 1;
                }
            }
        }

    }

    public static void main(String[] args) {
        boolean flag = true;
        int answer = Integer.MIN_VALUE;

        Scanner scanner = new Scanner(System.in);
        col = scanner.nextInt();
        row = scanner.nextInt();
        box = new int[row][col];
        elapsed = new int[row][col];

        for (int i = 0; i < row; i++) {
            for (int k = 0; k < col; k++) {
                box[i][k] = scanner.nextInt();
                if (box[i][k] == 1) queue.offer(new Point2(i, k));
            }
        }

        bfs();

        for (int[] rows : box) {
            for (int i : rows) {
                if (i == 0) flag = false;
            }
        }

        if (flag) {
            for (int[] rows : elapsed) {
                for (int i : rows) {
                    answer = Math.max(i, answer);
                }
            }
            System.out.println(answer);
        } else {
            System.out.println(-1);
        }
    }
}