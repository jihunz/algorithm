import java.util.ArrayList;
import java.util.Scanner;
import java.util.Stack;

public class Main4 {
    public static int calc(int first, int second, char op) {
        int result = 0;
        switch (op) {
            case '+':
                result = first+ second;
                break;
            case '-':
                result = first - second;
                break;
            case '*':
                result = first * second;
                break;
            case '/':
                result = first / second;
                break;
        }
        return result;
    }

    public static int solution(String str) {
        int answer = 0;
        Stack<Integer> stack = new Stack<>();
        int first = 0;
        int second = 0;

        for (char x : str.toCharArray()) {
            if (Character.isDigit(x)) {
                stack.push(Character.getNumericValue(x));
            } else {
                second = stack.pop();
                first = stack.pop();
                stack.push(calc(first, second, x));
            }
        }

        answer = stack.pop();

        return answer;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.next();
        System.out.println(solution(str));
    }
}