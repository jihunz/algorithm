import java.util.Scanner;

public class Main3 {
    public static int recursive(int x) {
        if (x == 1) return 1;
        else {
            return x * recursive(x-1);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        System.out.println(recursive(x));
    }
}