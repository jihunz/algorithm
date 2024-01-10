package string;

import java.util.Scanner;

public class Main13 {
    public static String solution(String x, int y) {
        String answer = "";

        for (int i = 0; i < y; i++) {
            String tmp = x.substring(0, 7).replace("#", "1").replace("*", "0");
            int num = Integer.parseInt(tmp, 2);
            answer += (char) num;
            x = x.substring(7);
        }

        return answer;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int y = scanner.nextInt();
        String x = scanner.next();
        System.out.println(solution(x, y));
    }
}