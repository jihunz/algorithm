import java.util.Scanner;


public class Main6 {
    static int[] arr;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int peopleNum = scanner.nextInt();
        int pairNum = scanner.nextInt();
        arr = new int[peopleNum + 1];

        for (int i = 1; i <= peopleNum; i++) arr[i] = i;

        for (int i = 1; i <= pairNum; i++) {
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            Union(a, b);
        }

        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int fa = Find(a);
        int fb = Find(b);
        if (fa == fb) System.out.println("YES");
        else System.out.println("NO");
    }

    private static int Find(int v) {
        if (v == arr[v]) return v;
        else return arr[v] = Find(arr[v]);
    }

    private static void Union(int a, int b) {
        int fa = Find(a);
        int fb = Find(b);
        if (fa != fb) arr[fa] = fb;
    }
}
