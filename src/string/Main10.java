package string;

import java.util.Scanner;

public class Main10 {
    public static int solution(String x) {
        int answer = 0;

        for (char y : x.toCharArray()) {
            if (y>=48 && y<=57) answer = answer * 10 + (y-48);
        }

        return answer;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String x = scanner.next();
        System.out.println(solution(x));
    }
}