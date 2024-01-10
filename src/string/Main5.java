package string;

import java.util.ArrayList;
import java.util.Scanner;

public class Main5 {
    public static ArrayList<String> solution(String[] str) {
        ArrayList<String> answer = new ArrayList<>();

        for (String s : str) {
            char[] cArr = s.toCharArray();
            int lt = 0, rt = s.length()-1;
            while (lt<rt) {
                char temp = cArr[lt];
                cArr[lt] = cArr[rt];
                cArr[rt] = temp;
                lt++;
                rt--;
            }
            answer.add(String.valueOf(cArr));
        }
        return answer;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();

        String[] str = new String[num];
        for (int i=0; i<num; i++) {
            str[i] = scanner.next();
        }

        for (String s : solution(str)) {
            System.out.println(s);
        }

    }
}