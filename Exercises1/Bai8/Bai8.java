//package exercise1;

import java.util.Scanner;

public class Bai8 {
    public static void main(String[] args) {
        int n;
        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt();

        int count = 0;
        for (int i = 1; i <= n; i++) {//xet uoc la so duong
            if (n % i == 0) {
                count++;
                System.out.print(i + " ");
            }
        }
        System.out.println("\nn co " + count + " uoc so");
    }
}
