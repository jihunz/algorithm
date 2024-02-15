package dfsAndBfsPractice;

import java.util.Scanner;

public class Main10 {

    static int answer = 0;
    static int[][] maze = new int[8][8];
    static int[] dirX = {-1, 0, 1, 0};
    static int[] dirY = {0, 1, 0, -1};

    public static void dfs(int x, int y) {
        if (x == 7 && y == 7) answer++;
        else {
            for (int i = 0; i < 4; i++) {
                int nx = x + dirX[i];
                int ny = y + dirY[i];
                if (nx >= 1 && nx <= 7 && ny >= 1 && ny <= 7 && maze[nx][ny] == 0) {
                    maze[nx][ny] = 1;
                    dfs(nx, ny);
                    maze[nx][ny] = 0;
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        for (int i = 1; i <= 7; i++) {
            for (int k = 1; k <= 7; k++) {
                maze[i][k] = scanner.nextInt();
            }
        }
        maze[1][1] = 1;
        dfs(1, 1);
        System.out.println(answer);
    }
}