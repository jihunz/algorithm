import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Main4 {
    public static int solution(String s1, String s2) {
        int answer = 0;
        HashMap<Character, Integer> map1 = new HashMap<>();
        HashMap<Character, Integer> map2 = new HashMap<>();
        for (char x : s2.toCharArray()) map2.put(x, map2.getOrDefault(x, 0) + 1);
        int l = s2.length() - 1;
        for (int i = 0; i < l; i++) map1.put(s1.charAt(i), map1.getOrDefault(s1.charAt(i), 0) + 1);

        int lt = 0;
        for (int rt = l; rt < s1.length(); rt++) {
            char rtChar = s1.charAt(rt);
            char ltChar = s1.charAt(lt);

            map1.put(rtChar, map1.getOrDefault(rtChar, 0)+1);
            if (map1.equals(map2)) answer++;

            map1.put(ltChar, map1.get(ltChar)-1);
            if (map1.get(ltChar) == 0) map1.remove(ltChar);
            lt++;
        }


        return answer;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String n = scanner.next();
        String m = scanner.next();

        System.out.print(solution(n, m));

    }
}