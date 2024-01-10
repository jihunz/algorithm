package string;

import java.util.ArrayList;
import java.util.Scanner;

public class Main6 {
    public static String solution(String x) {
        String answer = "";
        char[] arr = x.toCharArray();
        char temp;
        int lt = 0, rt = arr.length-1;

        while (lt < rt) {
            if (!Character.isAlphabetic(arr[lt])) {
                lt++;
            } else if (!Character.isAlphabetic(arr[rt])) {
                rt--;
            } else {
                temp = arr[lt];
                arr[lt] = arr[rt];
                arr[rt] = temp;
                lt++;
                rt--;
            }
        }

        answer = String.valueOf(arr);
        return answer;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String x = scanner.next();
        System.out.println(solution(x));
    }
}