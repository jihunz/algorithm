import java.util.Scanner;

public class Main4 {
    public static int solution(int n, int m, int[] arr) {
        int answer = 0, sum = 0, lt = 0;

        for (int rt = 0; rt < n; rt++) {
            sum += arr[rt];
            if (sum == m) answer++;

            while (sum >= m) {
                sum -= arr[lt++];
                if (sum == m) answer++;
            }
        }


        return answer;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int x = scanner.nextInt();
        int y = scanner.nextInt();
        int[] arr = new int[x];
        for (int i = 0; i < x; i++) {
            arr[i] = scanner.nextInt();
        }
        System.out.println(solution(x, y, arr));
    }
}