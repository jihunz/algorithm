import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;


class Body implements Comparable<Body> {
    public int h, w;

    public Body(int h, int w) {
        this.h = h;
        this.w = w;
    }

    @Override
    public int compareTo(Body body) {
        return body.h - this.h;
    }
}

public class Main {
    static int solution(ArrayList<Body> list, int n) {
        int cnt = 0;
        Collections.sort(list);
        int max = Integer.MIN_VALUE;
        for (Body body : list) {
            if (body.w > max) {
                max = body.w;
                cnt++;
            }
        }
        return cnt;
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        ArrayList<Body> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            int h = scanner.nextInt();
            int w = scanner.nextInt();
            list.add(new Body(h, w));
        }
        System.out.println(solution(list, n));

    }


}
