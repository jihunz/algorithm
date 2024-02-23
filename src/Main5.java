import java.util.Arrays;
import java.util.Scanner;

public class Main5 {
    static int coinNum, total;
//    1~목표액을 인덱스로하고, 조합의 개수 저장하는 배열
    static int[] dy;

//    Knapsack 알고리즘 -> 조합 최적화 문제 해결 알고리즘
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        coinNum = scanner.nextInt();
        int[] arr = new int[coinNum];
        for (int i = 0; i < coinNum; i++) {
            arr[i] = scanner.nextInt();
        }

        total = scanner.nextInt();
        dy = new int[total + 1];
        System.out.println(solution(arr));

    }

    static int solution(int[] coin) {
        Arrays.fill(dy, Integer.MAX_VALUE);
        dy[0] = 0;
//        동전값 별로 순회 -> 1, 2, 5
        for (int i = 0; i < coinNum; i++) {
//            현재 동전값부터 목표액까지 순회
            for (int j = coin[i]; j <= total; j++) {
//                현재 조합 개수 = 기존 동전 조합 개수 / 현재 동전을 이용한 조합 중 최소값(현재 목표액 - 현재 동전값 인덱스의 조합 개수 + 1 -> +1은 현재 목표액(인덱스)으로부터 현재액을 뺀 인덱스의 '조합 개수'를 추출하고 현재 동전을 더하겠다는 의미)
                dy[j] = Math.min(dy[j], dy[j - coin[i]] + 1);
            }
        }
        return dy[total];
    }
}
