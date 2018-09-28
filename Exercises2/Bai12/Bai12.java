package exercise2;

import java.util.Scanner;

public class Bai12 {
    /*
        Các bước thực hiện:
        - Tạo mảng đối sánh tương ứng với hệ cơ số
        - Chuyển đổi cơ số-> tạo kết quả đảo
        - Đảo lại kết quả -> Done!
     */
    public static final String BASE = "0123456789ABCDEFGHIJKLMNOPQRSTUVXYZW";

    public static String result(int n, int b){
        StringBuilder stringBuilder = new StringBuilder();
        int x = 0;
        while(n > 0){
            x = n%b;
            n/= b;
            stringBuilder.append(BASE.charAt(x));
        }
        return stringBuilder.reverse().toString();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n, b;
        System.out.println("Nhap gia tri, co so: ");
        n = scanner.nextInt();
        b = scanner.nextInt();

        System.out.println("KET QUA: " + result(n, b));
    }
}
