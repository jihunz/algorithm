package sortingAndSearching;

import java.util.Scanner;

public class Main3 {
    public static int[] solution(int a, int[] arr) {
        for (int i = 1; i < a; i++) {
            int tmp = arr[i], j;

            for (j = i - 1; j >= 0; j--) {
                if (arr[j] > tmp) arr[j+1] = arr[j];
                else break;
            }
            arr[j+1] = tmp;
        }

        return arr;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int[] arr = new int[a];
        for (int i = 0; i < a; i++) {
            arr[i] = scanner.nextInt();
        }
        for (int x : solution(a, arr)) {
            System.out.print(x + " ");
        }
    }
}