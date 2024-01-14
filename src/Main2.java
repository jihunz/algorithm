import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main2 {
    public static ArrayList<Integer> solution(int n, int m, int[] arr, int[] arr2) {
        ArrayList<Integer> answer = new ArrayList<>();
        Arrays.sort(arr);
        Arrays.sort(arr2);
        int p1 = 0, p2 = 0;
        while (p1 < n && p2 < m) {
            if (arr[p1] == arr2[p2]) {
                answer.add(arr[p1++]);
                p2++;
            } else if(arr[p1] < arr2[p2]) p1++;
            else p2++;
        }
        return answer;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int x = scanner.nextInt();
        int[] arr = new int[x];
        for (int i = 0; i < x; i++) {
            arr[i] = scanner.nextInt();
        }

        int y = scanner.nextInt();
        int[] arr2 = new int[y];
        for (int i = 0; i < y; i++) {
            arr2[i] = scanner.nextInt();
        }

        for (int k : solution(x, y, arr, arr2)) {
            System.out.print(k + " ");
        }
    }
}