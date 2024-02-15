import java.util.ArrayList;
import java.util.Scanner;

class Point4 {
    int x, y;

    public Point4(int x, int y) {
        this.x = x;
        this.y = y;
    }
}

public class Main15 {
    static int n, m, len, answer = Integer.MAX_VALUE;
    static ArrayList<Point4> house, pizza;
    static int[] combo;


    public static void dfs(int level, int idx) {
        if (level == m) {
            int sum = 0;
            for (Point4 h : house) {
                int dis = Integer.MAX_VALUE;
                for (int c : combo) {
                    dis = Math.min(dis, (Math.abs(h.x - pizza.get(c).x) + Math.abs(h.y - pizza.get(c).y)));
                }
                sum += dis;
            }
            answer = Math.min(answer, sum);
        } else {
            for (int i = idx; i < len; i++) {
                combo[level] = i;
                dfs(level + 1, idx + 1);
            }
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt();
        m = scanner.nextInt();
        house = new ArrayList<>();
        pizza = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                int tmp = scanner.nextInt();
                if (tmp == 1) house.add(new Point4(i, j));
                else if (tmp == 2) pizza.add(new Point4(i, j));
            }
        }

        len = pizza.size();
        combo = new int[m];

        dfs(0, 0);
        System.out.println(answer);
    }
}