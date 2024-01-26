package sortingAndSearching;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main5 {
    public static ArrayList<Integer> solution(int size, int[] arr) {
        ArrayList<Integer> answer = new ArrayList<>();
        int[] newArr = Arrays.copyOf(arr, size);
//        int[] newArr = arr.clone();
//        Arrays.sort(newArr);

        for (int i = 0; i < size - 1; i++) {
            int tmp, j = i;
            while (arr[j] > arr[j+1]) {
                tmp = arr[j];
                arr[j] = arr[j+1];
                arr[j+1] = tmp;
                j--;
            }
        }

        for (int i = 0; i < size; i++) {
            if (arr[i] != newArr[i]) answer.add(i+1);
        }

        return answer;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int[] arr = new int[a];
        for (int i = 0; i < a; i++) {
            arr[i] = scanner.nextInt();
        }
        for (int o : solution(a, arr)) {
            System.out.print(o + " ");
        }
    }
}