import java.util.*;

public class Main8 {
    static class Person {
        int id;
        int priority;
    }

    public static int solution(int a, int b, int[] arr) {
        int answer = 0;
        Queue<Person> q = new LinkedList<>();

        for (int i = 0; i < a; i++) {
            Person p = new Person();
            p.id = i;
            p.priority = arr[i];
            q.offer(p);
        }

        while (!q.isEmpty()) {
            Person tmp = q.poll();
            for (Person x : q) {
                if (x.priority > tmp.priority) {
                    q.offer(tmp);
                    tmp = null;
                    break;
                }

            }
            if (tmp != null) {
                answer++;
                if (tmp.id == b) return answer;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int[] arr = new int[a];
        for (int i = 0; i < a; i++) {
            arr[i] = scanner.nextInt();
        }

        System.out.println(solution(a, b, arr));
    }
}