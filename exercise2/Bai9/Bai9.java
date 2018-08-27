package exercise2;

import java.util.Scanner;

public class Bai9 {
    /*       A[3][4]             B[4][3]        C[3][3]
        i..j_0_1_2_3___          _0_1_2__
        0..  1 2 3 4          0.. 1 3 3         c[i][j]
        1..  2 3 5 0          1.. 2 8 5
        2..  7 5 2 3          2.. 6 4 1
                              3.. 2 1 1
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int m, n, k;
        int[][] a, b, c;
        System.out.println("Nhap cap ma tran a: ");
        // nhap so tu nhien > 0
        m = scanner.nextInt();
        n = scanner.nextInt();
        System.out.println("Nhap so cot ma tran b: ");
        k = scanner.nextInt();
        System.out.println("Nhap ma tran a: ");
        a = nhap(m, n, scanner);
        System.out.println("Nhap ma tran b: ");
        b = nhap(n, k, scanner);
        System.out.println("Ma tran a: ");
        xuat(a);

        System.out.println("Ma tran b: ");
        xuat(b);

        c = nhanMaTran(a, b);
        System.out.println("Ket qua: ");
        xuat(c);

    }



    public static int[][] nhap(int m, int n, Scanner scanner){
        int[][] x = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                x[i][j] = scanner.nextInt();
            }
        }
        return x;
    }

    public static void xuat(int[][] x){
        for (int i = 0; i < x.length; i++) {
            for (int j = 0; j < x[0].length; j++) {
                System.out.printf("%5d", x[i][j]);
            }
            System.out.println();
        }
    }

    public static int[][] nhanMaTran(int[][] a, int[][] b){
        int[][] c = new int[a.length][b[0].length];
        int m = a.length;
        int n = b[0].length;
        int k = a[0].length;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                for (int l = 0; l < k; l++) {
                    c[i][j] += a[i][l] * b[l][j];
                }
            }
        }
        return c;
    }
}
