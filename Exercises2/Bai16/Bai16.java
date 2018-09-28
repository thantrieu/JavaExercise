package exercise2;

import java.util.Scanner;

public class Bai16 {
    public static void main(String[] args) {
        /*
            1. Nhập dữ liệu vào
            2. tách từ
            3. tìm độ dài từng từ, nếu từ nào dài nhất thì gán:
               + lưu lại độ dài
               + lưu lại giá trị chỉ số của nó
            4. Xuất ra kết quả.
            DONE!
         */

        Scanner scanner = new Scanner(System.in);
        String input;
        //nhap du lieu vao
        input = scanner.nextLine();// doc ca dong
        // tach tu
        String[] inputs = input.split(" ");
        // tim do dai, dai max, index
        int index = 0;
        int lenMax = 0; // do dai max cua tu trong xau
        for (int i = 0; i < inputs.length; i++) {
            int len = inputs[i].length();
            if (len > lenMax) {
                lenMax = len;
                index = i;
            }
        }
        //output
        System.out.println("Tu: " + inputs[index] + ", tu thu: " + (index + 1)
                + ", do dai: " + lenMax);
    }
}
