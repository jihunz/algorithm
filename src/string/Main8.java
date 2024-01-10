package string;

import java.util.Scanner;

public class Main8 {
    public static String solution(String x) {
        String answer = "YES";
        x = x.toLowerCase();

        int length = x.length();
//        반복은 절반만 진행 -> 반복문 내부에서 양끝 인덱스 이동
        for (int i = 0; i < length/2; i++) {
            if (x.charAt(i) != x.charAt(length - i - 1)) return "NO";
        }

        return answer;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String x = scanner.next();
        System.out.println(solution(x));
    }
}