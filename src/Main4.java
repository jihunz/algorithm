import java.util.Scanner;

public class Main4 {
    static int[] fibo;

    public static int recursive(int x) {
        if (fibo[x] > 0) return fibo[x];

        if (x == 1) return fibo[x] = 1;
        else if (x == 2) return fibo[x] = 1;
        else {
            return fibo[x] = recursive(x - 2) + recursive(x - 1);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        fibo = new int[x + 1];
        recursive(x);
        for (int i = 1; i <= x; i++) System.out.print(fibo[i] + " ");
    }
}