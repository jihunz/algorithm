import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

class Time2 implements Comparable<Time2> {
    int start, end;

    public Time2(int start, int end) {
        this.start = start;
        this.end = end;
    }

    @Override
    public int compareTo(Time2 other) {
        if (this.end == other.end) return this.start - other.start;
        else return this.end - other.end;
    }
}

public class Main3 {

    static int solution(ArrayList<Time2> list, int n) {
        int cnt = 0;
        Collections.sort(list);
        int et = 0;
        for (Time2 time : list) {
            if (time.start >= et) {
                cnt++;
                et = time.end;
            }
        }
        return cnt;
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        ArrayList<Time2> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            int start = scanner.nextInt();
            int end = scanner.nextInt();
            list.add(new Time2(start, end));
        }
        System.out.println(solution(list, n));;
    }


}
