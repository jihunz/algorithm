import java.util.Scanner;

public class Main4 {
    public static int recursive(int x) {
        if (x == 1) return 1;
        else if (x == 2) return 1;
        else {
            return recursive(x-2) + recursive(x-1);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        for (int i=1; i<=x; i++) System.out.print(recursive(i) + " ");
    }
}