package stackAndQueue;

import java.util.Scanner;
import java.util.Stack;

public class Main2 {
    public static String solution(String s) {
        String answer = "";
        Stack<Character> stack = new Stack<>();

        for (char x : s.toCharArray()) {
            if (x == ')') {
                while (stack.pop() != '(');
            } else {
                stack.push(x);
            }
        }

        for (int i = 0; i < stack.size(); i++) {
            answer += stack.get(i);
        }
        return answer;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.next();
        System.out.println(solution(s));
    }
}