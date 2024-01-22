package stackAndQueue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main7 {
    public static String solution(String s1, String s2) {
        String answer = "YES";
        Queue<Character> queue = new LinkedList<>();

        for (char x : s1.toCharArray()) queue.offer(x);
        for (char x : s2.toCharArray()) {
            if (queue.contains(x)) {
                if (x != queue.poll()) return "NO";
            }
        }

        if (!queue.isEmpty()) return "NO";
        return answer;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String n = scanner.next();
        String m = scanner.next();
        System.out.println(solution(n, m));
    }
}