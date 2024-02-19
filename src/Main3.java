import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

class Time2 implements Comparable<Time2> {
    int time;
    char state;

    public Time2(int time, char state) {
        this.time = time;
        this.state = state;
    }
    @Override
    public int compareTo(Time2 param) {
        if (this.time == param.time) return this.state-param.state;
        else return this.time-param.time;
    }
}

public class Main3 {

    static int solution(ArrayList<Time2> list, int n) {
        int answer = Integer.MIN_VALUE;
        Collections.sort(list);
        int cnt = 0;
        for (Time2 time : list) {
            if (time.state == 's') cnt++;
            else cnt--;

            answer = Math.max(answer, cnt);
        }
        return answer;
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        ArrayList<Time2> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            int start = scanner.nextInt();
            int end = scanner.nextInt();
            list.add(new Time2(start, 's'));
            list.add(new Time2(end, 'e'));

        }
        System.out.println(solution(list, n));;
    }


}
