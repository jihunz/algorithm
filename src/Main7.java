import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main7 {
    public static int solution(int size, int target, int[] arr) {
        int answer = 0;
        Arrays.sort(arr);

        int lt = 0, rt = size - 1;
        while (lt <= rt) {
            int mid = (lt + rt) / 2;

            if (arr[mid] == target) {
                answer = mid + 1;
                break;
            } else if (target < arr[mid]) {
                rt = mid - 1;
            } else {
                lt = mid + 1;
            }
        }
        return answer;
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