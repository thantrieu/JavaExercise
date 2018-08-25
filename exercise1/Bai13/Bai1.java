package exercise1;

import java.util.Scanner;

public class Bai1 {
    public static void main(String[] args) {
        int m, n;
        Scanner scanner = new Scanner(System.in);
        m = scanner.nextInt();// chieu cao hinh chu nhat
        n = scanner.nextInt();// chieu rong hinh chu nhat

        for(int i = 0; i< m;i++){// tang hang
            for(int j = 0; j< n; j++){// tang theo cot
                System.out.print(" * ");
                //*************
            }
            System.out.println();// in xuong dong
        }
    }
}
