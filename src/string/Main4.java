package string;

import java.util.Scanner;

public class Main4 {
    public static String solution(String s) {
        String answer = "";
        int max = Integer.MIN_VALUE, pos;

        while ((pos = s.indexOf(' ')) != -1) {
            String tmp = s.substring(0, pos);
            int len = tmp.length();

            if (len > max) {
                max = len;
                answer = tmp;
            }
            s = s.substring(pos + 1);
        }

        if (s.length() > max) answer = s;
        return answer;


    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        System.out.println(solution(s));
    }
}