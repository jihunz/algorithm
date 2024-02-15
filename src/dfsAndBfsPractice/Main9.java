package dfsAndBfsPractice;

import java.util.Scanner;

public class Main9 {
    static int num, pickNum;
    static int[] answer;

    public static void dfs(int level, int currNum) {
        if (level == pickNum) {
            for (int x : answer) {
                System.out.print(x + " ");
            }
            System.out.println();
        } else {
            for (int i = currNum; i <= num; i++) {
                answer[level] = i;
                dfs(level + 1, i + 1);
            }
        }

    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        num = scanner.nextInt();
        pickNum = scanner.nextInt();
        answer = new int[pickNum];
        dfs(0, 1);
    }
}