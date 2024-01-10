import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static ArrayList<Integer> solution(int x, int[] y) {
        ArrayList<Integer> answer = new ArrayList<>();
        answer.add(y[0]);


        for (int i=1; i<y.length; i++) {
            if (y[i-1] < y[i]) {
                answer.add(y[i]);
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int[] arr = new int[x];
        for (int i=0; i < x; i++) {
            arr[i] = scanner.nextInt();
        }

        for (int k : solution(x, arr)) {
            System.out.print(k + " ");
        }
    }
}