package array;

import java.util.Scanner;

public class Main5 {
    public static int solution(int x) {
        int answer = 0;
        int[] tmp = new int[x+1];

        for (int i = 2; i <= x; i++) {
            if (tmp[i] == 0) {
                answer++;
                for (int j = i; j <=x; j=j+i) {
                    tmp[j] = 1;
                }
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        System.out.println(solution(x));
    }
}