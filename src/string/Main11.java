package string;

import java.util.Scanner;

public class Main11 {
    public static int[] solution(String x, char y) {
        int[] answer = new int[x.length()];
        int p = 1000;

        for (int i = 0; i < x.length(); i++) {
            if (y == x.charAt(i)) {
                p = 0;
                answer[i] = p;
            } else {
                answer[i] = ++p;
            }
        }

        p = 1000;
        for (int i = x.length()-1; i >= 0; i--) {
            if (y == x.charAt(i)) {
                p = 0;
            } else {
                p++;
                answer[i] = Math.min(answer[i], p);
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String x = scanner.next();
        char y = scanner.next().charAt(0);
        int[] result = solution(x, y);

        for (int i : result) {
            System.out.print(i + " ");
        }
    }
}