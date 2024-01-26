package sortingAndSearching;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Main10 {
    public static int solution(int size, int num, int[] arr) {
        int answer = 0;
        Arrays.sort(arr);
        int lt = 1;
        int rt = arr[size - 1];
        while (lt <= rt) {
            int mid = (lt + rt) / 2;

            if (count(arr, mid) >= num) {
                answer = mid;
                lt = mid + 1;
            } else {
                rt = mid - 1;
            }
        }
        return answer;
    }

    private static int count(int[] arr, int dist) {
        int cnt = 1;
        int ep = arr[0];

        for (int i=0; i<arr.length; i++) {
            if (arr[i]-ep >= dist) {
                cnt++;
                ep = arr[i];
            }
        }
        return cnt;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int[] arr = new int[a];
        for (int i = 0; i < a; i++) {
            arr[i] = scanner.nextInt();
        }
        System.out.println(solution(a, b, arr));
    }
}