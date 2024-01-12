package array;

import java.util.ArrayList;
import java.util.Scanner;

public class Main9 {
    public static int solution(int x, int[][] arr) {
        int answer = 0;
        int diagonal1 = 0;
        int diagonal2 = 0;
        ArrayList<Integer> rcList = new ArrayList<>();

        for (int i = 0; i < x; i++) {
            diagonal1 += arr[i][i];
            diagonal2 += arr[i][x - (i+1)];

            int rowSum = 0;
            int columnSum = 0;
            for (int k = 0; k < x; k++) {
                rowSum += arr[i][k];
                columnSum += arr[k][i];
            }
            rcList.add(rowSum);
            rcList.add(columnSum);
        }
        rcList.add(diagonal1);
        rcList.add(diagonal2);

        for (int a : rcList) {
            if (a > answer) {
                answer = a;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int[][] arr2 = new int[x][x];

        for (int i = 0; i < x; i++) {
            int[] arr = new int[x];
            for (int k = 0; k < x; k++) {
                arr[k] = scanner.nextInt();
            }
            arr2[i] = arr;
        }

        System.out.print(solution(x, arr2));
    }
}