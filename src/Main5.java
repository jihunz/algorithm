import java.util.Comparator;
import java.util.HashMap;
import java.util.Scanner;
import java.util.TreeSet;

public class Main5 {
    public static int solution(int n, int m, int[] arr) {
        int answer = -1;
        TreeSet<Integer> tSet = new TreeSet<>(Comparator.reverseOrder());

        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                for (int k = j + 1; k < n; k++) {
                    tSet.add(arr[i] + arr[j] + arr[k]);
                }
            }
        }

        int cnt = 0;
        for (int x : tSet) {
            cnt++;
            if (cnt == m) answer = x;
        }

        return answer;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) arr[i] = scanner.nextInt();

        System.out.print(solution(n, m, arr));

    }
}