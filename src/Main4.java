import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;


class Brick implements Comparable<Brick> {
    int width, height, weight;

    public Brick(int width, int height, int weight) {
        this.width = width;
        this.height = height;
        this.weight = weight;
    }

    @Override
//객체를 Comparable로 오름차순 정렬
    public int compareTo(Brick param) {
        return param.width - this.width;
    }
}

//LIS(최장 증가 부분 수열) 활용
public class Main4 {

    // 벽돌별 최대 누적 높이 저장용 배열
    static int[] dy;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        dy = new int[n];
        ArrayList<Brick> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            int width = scanner.nextInt();
            int height = scanner.nextInt();
            int weight = scanner.nextInt();
            list.add(new Brick(width, height, weight));
        }
        System.out.println(solution(list));
    }

    static int solution(ArrayList<Brick> list) {
        int answer = 0;
        Collections.sort(list);
        dy[0] = list.get(0).height;
        answer = dy[0];

        for (int i = 1; i < list.size(); i++) {
            int maxHeight = 0;
            // 이중 for -> j는 i - 1부터 역순으로 탐색
            for (int j = i - 1; j >= 0; j--) {
                // j가 i보다 무겁고 최대 높이를 가질 때 최대 높이 갱신
                if (list.get(j).weight > list.get(i).weight && dy[j] > maxHeight) {
                    maxHeight = dy[j];
                }
            }
//            dy의 현재 인덱스값은 최대 높이 + 현재 i의 높이
            dy[i] = maxHeight + list.get(i).height;
//            최대값을 구해야하기 떄문에 max()로 answer와 현재 누적 높이 즉시 비교
            answer = Math.max(answer, dy[i]);
        }

        return answer;
    }
}
