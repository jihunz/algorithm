package array;

import java.util.ArrayList;
import java.util.Scanner;

public class Main2 {
    public static ArrayList<String> solution(int x, int[] arr, int[] arr2) {
        ArrayList<String> answer = new ArrayList<>();

        for (int i = 0; i < x; i++) {
            if (arr[i] == arr2[i]) answer.add("D");
            else if (arr[i] == 1 && arr2[i] == 3) answer.add("A");
            else if (arr[i] == 2 && arr2[i] == 1) answer.add("A");
            else if (arr[i] == 3 && arr2[i] == 2) answer.add("A");
            else answer.add("B");
        }

        return answer;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int[] arr = new int[x];
        int[] arr2 = new int[x];

        for (int i = 0; i < x; i++) {
            arr[i] = scanner.nextInt();
        }

        for (int i = 0; i < x; i++) {
            arr2[i] = scanner.nextInt();
        }

        for (String a : solution(x, arr, arr2)) {
            System.out.println(a);
        }
    }
}