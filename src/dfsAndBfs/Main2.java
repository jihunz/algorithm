package dfsAndBfs;

import java.util.Scanner;

public class Main2 {
    public static void recursive(int x) {
        if (x == 0) return;
        else {
            recursive(x/2);
            System.out.print(x % 2 + " ");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        recursive(x);
    }
}