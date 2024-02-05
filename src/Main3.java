import java.util.Scanner;

public class Main3 {
    static int answer = 0, num, timeLimit;
    public static void dfs(int level, int totalTime, int sum, int[][] arr) {
        if (totalTime > timeLimit) return;

        if (level == num) {
            answer = Math.max(answer, sum);
        } else {
            dfs(level+1, totalTime+arr[level][1], sum+arr[level][0], arr);
            dfs(level+1, totalTime, sum, arr);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        num = scanner.nextInt();
        timeLimit = scanner.nextInt();

        int[][] arr = new int[num][2];
        for (int i = 0; i < num; i++) {
            arr[i][0] = scanner.nextInt();
            arr[i][1] = scanner.nextInt();
        }

        dfs(0, 0, 0, arr);
        System.out.println(answer);
    }
}