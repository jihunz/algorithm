import java.util.Arrays;
import java.util.Scanner;

public class Main5 {
    public static String solution(int size, int[] arr) {
        String answer = "U";
        Arrays.sort(arr);
        for (int i = 0; i < size-1; i++) {
            if (arr[i] == arr[i+1]) return "D";
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
        System.out.println(solution(a, arr));
    }
}