import java.util.Scanner;
import java.util.Stack;

public class Main2 {
    public static String solution(String s) {
        String answer = "";
        Stack<Character> stack = new Stack<>();

        for (char x : s.toCharArray()) {
            if (x == '(') {
                stack.push(x);
            } else if (x == ')') {
                stack.pop();
            } else {
                if (stack.isEmpty()) answer += x;
            }

        }


        return answer;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.next();
        System.out.println(solution(s));
    }
}