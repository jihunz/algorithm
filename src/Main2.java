import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

class Time implements Comparable<Time> {
    int start, end;

    public Time(int start, int end) {
        this.start = start;
        this.end = end;
    }

    @Override
    public int compareTo(Time other) {
        if (this.end == other.end) return this.start - other.start;
        else return this.end - other.end;
    }
}

public class Main2 {

    static int solution(ArrayList<Time> list, int n) {
        int cnt = 0;
        Collections.sort(list);
        int et = 0;
        for (Time time : list) {
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
        ArrayList<Time> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            int start = scanner.nextInt();
            int end = scanner.nextInt();
            list.add(new Time(start, end));
        }
        System.out.println(solution(list, n));;
    }


}
