import java.util.ArrayList;
import java.util.Scanner;

public class Main8 {
    public static ArrayList<Integer> solution(int x, int[] arr) {
        ArrayList<Integer> answer = new ArrayList<>();

        for (int i = 0; i < x; i++) {
            int rank = 1;

            for (int j = 0; j < x; j++) {
                if (arr[i] < arr[j]) {
                    rank++;
                }
            }

            answer.add(rank);
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

        for (int a : solution(x, arr)) {
            System.out.print(a + " ");
        }
    }
}