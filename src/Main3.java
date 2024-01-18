import java.util.Scanner;
import java.util.Stack;

public class Main3 {
    public static int solution(int[][] board, int[] move) {
        int answer = 0;
        Stack<Integer> stack = new Stack<>();

        for (int pos : move) {
            for (int i = 0; i < board.length; i++) {
                if (board[i][pos-1] != 0) {
                    int tmp = board[i][pos-1];
                    board[i][pos-1] = 0;

                    if (!stack.isEmpty() && stack.peek() == tmp) {
                        answer += 2;
                        stack.pop();
                    } else {
                        stack.push(tmp);
                    }
                    break;
                }
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[][] board = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                board[i][j] = scanner.nextInt();
            }
        }

        int m = scanner.nextInt();
        int[] move = new int[m];

        for (int k = 0; k < m; k++) {
            move[k] = scanner.nextInt();
        }


        System.out.println(solution(board, move));
    }
}