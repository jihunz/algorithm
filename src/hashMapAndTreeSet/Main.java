package hashMapAndTreeSet;

import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public static char solution(int n, String s) {
        char answer = ' ';
        HashMap<Character, Integer> map = new HashMap<>();
        for (char x : s.toCharArray()) {
            map.put(x, map.getOrDefault(x, 0)+1);
        }

        int max = Integer.MIN_VALUE;
        for (char k : map.keySet()) {
            if (map.get(k) > max) {
                max = map.get(k);
                answer = k;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        String s = scanner.next();
        System.out.println(solution(n, s));
    }
}