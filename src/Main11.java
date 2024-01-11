import java.util.Scanner;

public class Main11 {
    public static int solution(int n, int[][] arr) {
        int answer = 0, max = Integer.MIN_VALUE;

        for (int i = 1; i <= n; i++) {
            int cnt = 0;
            for (int j = 1; j <= n; j++) {
                for (int k = 1; k <= 5; k++) {
                    if (arr[i][k] == arr[j][k]) {
                        cnt++;
                        break;
                    }
                }
            }
            if (cnt > max) {
                max = cnt;
                answer = i;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int[][] arr = new int[x + 1][6];

        for (int i = 1; i <= x; i++) {
            for (int k = 1; k <= 5; k++) {
                arr[i][k] = scanner.nextInt();
            }
        }

        System.out.print(solution(x, arr));
    }
}