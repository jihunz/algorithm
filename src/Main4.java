import java.util.Scanner;

public class Main4 {
    public static int solution(int n) {
        int answer = 0, sum = 0, cnt = 0, lt = 1, rt = 1;

        while (true) {
            if (cnt == 2 && sum > n) {
                break;
            }

            if (sum > n) {
                rt = ++lt;
                cnt = 0;
                sum = 0;
                continue;
            }

            sum += rt++;
            cnt++;

            if (sum == n) {
                answer++;
                rt = ++lt;
                cnt = 0;
                sum = 0;
            }
        }


        return answer;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        System.out.println(solution(x));
    }
}