package twoPointerAndSlidingWindow;

import java.util.Scanner;

public class Main5 {
    public static int solution(int n, int m, int[] arr) {
        int answer = 0;
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