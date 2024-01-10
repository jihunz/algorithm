package string;

import java.util.Scanner;

public class Main7 {
    public static String solution(String x) {
        String answer = "";

//        중복문자를 제거하는 것이 아닌 고유한 문자를 남기는 것 -> charAt(): 문자가 중복될 경우 처음 등장하는 문자 반환
        for (int i = 0; i < x.length(); i++) {
            if (x.indexOf(x.charAt(i)) == i) answer += x.charAt(i);
        }

        return answer;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String x = scanner.next();
        System.out.println(solution(x));
    }
}