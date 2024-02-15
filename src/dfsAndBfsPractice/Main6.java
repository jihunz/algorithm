package dfsAndBfsPractice;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Main6 {
    static int[] pm, chk, arr;
    static int n, m;

    public static void dfs(int level) {
        if (level == m) {
            for (int x : pm) System.out.print(x + " ");
            System.out.println();
        } else {
            for (int i = 0; i < n; i++) {
                if (chk[i] == 0) {
                    chk[i] = 1;
                    pm[level] = arr[i];
                    dfs(level + 1);
                    chk[i] = 0;
                }
            }
        }

    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt();
        m = scanner.nextInt();
        arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        chk = new int[n];
        pm = new int[m];
        dfs(0);
    }
}