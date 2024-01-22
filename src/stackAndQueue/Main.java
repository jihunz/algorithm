package stackAndQueue;

import java.util.Scanner;
import java.util.Stack;

public class Main {
    public static String solution(String s) {
        String answer = "YES";
        Stack<Character> stack = new Stack<>();

        for (char x : s.toCharArray()) {
            if (x == '(') stack.push(x);
            else {
                if (stack.isEmpty()) return "NO";
                stack.pop();
            }
        }

        if (!stack.isEmpty()) return "NO";
        return answer;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.next();
        System.out.println(solution(s));
    }
}