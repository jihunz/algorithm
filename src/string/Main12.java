package string;

import java.util.Scanner;

public class Main12 {
    public static String solution(String x) {
        String answer = "";
        int cnt = 1;
        x += " ";

        for (int i = 0; i < x.length()-1; i++) {
            if (x.charAt(i) == x.charAt(i+1)) {
                cnt++;
            } else {
                answer += x.charAt(i);
                if (cnt > 1) answer += String.valueOf(cnt);
                cnt = 1;
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String x = scanner.next();
        System.out.println(solution(x));
    }
}