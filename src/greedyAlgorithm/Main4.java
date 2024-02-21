package greedyAlgorithm;

import java.util.ArrayList;
import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Scanner;


class Lecture implements Comparable<Lecture> {
    int money;
    int date;

    public Lecture(int money, int date) {
        this.money = money;
        this.date = date;
    }

    @Override
    public int compareTo(Lecture param) {
        return param.date - this.date;
    }
}

public class Main4 {

    private static int n, max = Integer.MIN_VALUE;

    static int solution(ArrayList<Lecture> list) {
        int answer = 0;
        PriorityQueue<Integer> pQ = new PriorityQueue<>(Collections.reverseOrder());
        Collections.sort(list);

        int j = 0;
        for (int i = max; i >= 1; i--) {
            for (; j < n; j++) {
                if (list.get(j).date < i) break;

                pQ.offer(list.get(j).money);
            }

            if (!pQ.isEmpty()) answer += pQ.poll();
        }
        return answer;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt();
        ArrayList<Lecture> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            int money = scanner.nextInt();
            int date = scanner.nextInt();
            list.add(new Lecture(money, date));
            if (date > max) max = date;

            System.out.println(solution(list));
        }
    }
}
