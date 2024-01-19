import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class Main6 {
    public static int solution(int n, int m) {
        int answer = 0;
        Queue<Integer> que = new LinkedList<>();
        for (int i = 1; i <= n; i++) que.offer(i);
        while (!que.isEmpty()) {
            for (int k = 1; k < m; k++) que.offer(que.poll());
            que.poll();

            if (que.size() == 1) answer = que.poll();
        }
        return answer;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        System.out.println(solution(n, m));
    }
}