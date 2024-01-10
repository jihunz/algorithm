import java.util.ArrayList;
import java.util.Scanner;

public class Main6 {
    public boolean isPrime(int x) {
        if (x == 1) return false;
        for (int i = 2; i < x; i++) {
            if (x % i == 0) return false;
        }
        return true;
    }

    public ArrayList<Integer> solution(int x, int[] arr) {
        ArrayList<Integer> answer = new ArrayList<>();

        for (int i = 0; i < x; i++) {
            int tmp = arr[i];
            int res = 0;
            while (tmp > 0) {
                int t = tmp % 10;
                res = res * 10 + t;
                tmp = tmp / 10;
            }
            if (isPrime(res)) answer.add(res);
        }
        return answer;
    }

    public static void main(String[] args) {
        Main6 T = new Main6();
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();

        int[] y = new int[x];
        for (int i = 0; i < x; i++) {
            y[i] = scanner.nextInt();
        }

        for (int a : T.solution(x, y)) {
            System.out.print(a + " ");
        }
    }
}