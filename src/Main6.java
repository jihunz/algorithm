import java.util.Scanner;

public class Main6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        int maxTime = scanner.nextInt();
        int[] dy = new int[maxTime + 1];

        for (int i = 0; i < num; i++) {
            int score = scanner.nextInt();
            int time = scanner.nextInt();
//            j는 dy를 역순으로 순회
//            입력 시간 이하의 시간까지 순회할 경우 문제를 풀 수 없기 때문에 maxTime~입력시간까지만 순회
            for (int j = maxTime; j >= time; j--) {
//                dy[j]=점수 -> 현재 시간 - 입력받은 시간 인덱스 = 현재 점수로부터 입력 시간의 점수를 뺀 값 -> 해당 값에 점수를 더하여 더 큰값을 선택
//                -> 현재 인덱스에서 입력 시간을 빼서 입력 시간을 합산할 수 있는 시간의 점수를 가져오는 것이 핵심
                dy[j] = Math.max(dy[j], dy[j - time] + score);
            }
        }
        System.out.println(dy[maxTime]);
    }
}