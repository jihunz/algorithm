import java.util.Scanner;

public class Main4 {
    public static int solution(int n) {
        int answer = 0, cnt = 1;
        n--;

        while (n > 0) {
            cnt++;
            n -= cnt;
            if (n % cnt == 0) answer++;
        }
        return answer;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        System.out.println(solution(n));
    }
}