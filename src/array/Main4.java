package array;

import java.util.ArrayList;
import java.util.Scanner;

public class Main4 {
    public static void solution(int x) {
        int a = 1, b = 1, c;
        System.out.print(a + " " + b + " ");
        for (int i = 2; i < x; i++) {
            c = a + b;
            System.out.print(c + " ");
            a = b;
            b = c;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        solution(x);

//        for (int a : solution(x)) {
//            System.out.print(a + " ");
//        }
    }
}