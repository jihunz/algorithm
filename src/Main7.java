import java.util.Scanner;

public class Main7 {
    public static int solution(int x, int[] arr) {
        int answer = 0;
        int past = 0;

        for (int i = 0; i < x; i++) {
            if (arr[i] == 1) {
                past++;
                answer += past;
            } else {
                past = 0;
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int[] arr = new int[x];

        for (int i = 0; i < x; i++) {
            arr[i] = scanner.nextInt();
        }

        System.out.println(solution(x, arr));
    }
}