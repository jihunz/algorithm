package hashMapAndTreeSet;

import java.util.HashMap;
import java.util.Scanner;

public class Main2 {
    public static String solution(String s, String s2) {
        String answer = "YES";
        HashMap<Character, Integer> map = new HashMap<>();
        for (char x : s.toCharArray()) {
            map.put(x, map.getOrDefault(x, 0)+1);
        }

        for (char k : s2.toCharArray()) {
            if (!map.containsKey(k) || map.get(k) == 0) answer = "NO";
            map.put(k, map.get(k)-1);
        }

        return answer;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.next();
        String s2 = scanner.next();
        System.out.println(solution(s, s2));
    }
}