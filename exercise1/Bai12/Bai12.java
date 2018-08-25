//package exercise1;

import java.util.Scanner;

public class Bai12 {
    public static void main(String[] args) {
        int n;
        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt();
        long f0 = 0, f1 = 1, fn = 0;
        for (int i = 0; i <= n; i++) {
            if (i < 2) {
                System.out.println(i);
            } else {
                fn = f0 + f1;
                f0 = f1;
                f1 = fn;
                System.out.println(fn);
            }
        }
    }
}
