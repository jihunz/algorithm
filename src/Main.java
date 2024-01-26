import java.util.Scanner;

public class Main {
    public static void recursive(int x) {
        if (x == 0) return;
        else {
            System.out.print(x + " ");
            recursive(x - 1);
        }

    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        recursive(x);
    }
}