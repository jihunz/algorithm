package string;

import java.util.Scanner;

public class Main9 {
    public static String solution(String x) {
        String answer = "YES";

        String y = x.replaceAll("[\\p{Punct}\\d\\s]", "").toLowerCase();
        int len = y.length();

        for (int i = 0; i < len/2; i++) {
            if (y.charAt(i) != y.charAt(len-(i+1))) {
                return "NO";
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String x = scanner.nextLine();
        System.out.println(solution(x));
    }
}