//package exercise2;

import java.util.Arrays;
import java.util.Scanner;

public class Bai6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] arr;
        int n, x;
        n = scanner.nextInt();
        System.out.println("Nhap cac phan tu cua mang arr[] co "+ n + " phan tu: ");
        arr = nhap(n, scanner);
        System.out.println("Nhap x: ");
        x = scanner.nextInt();

        int index = -1;
        for (int i = 0; i < n; i++) {
            if(arr[i] > x){
                index = i;
                break;
            }
        }

        if(index == -1){
            // chen vao cuoi
            arr[n] = x;
        }else{
            //dich phai toan bo cac phan tu tu vi tri index
            for (int i = n; i > index ; i--) {
                arr[i] = arr[i-1];
            }
            arr[index] = x;
        }

        System.out.println(Arrays.toString(arr));
    }
    //[1 2 3 4 5 6 ] , x = 5

    public static int[] nhap(int n, Scanner scanner) {
        int[] x = new int[n + 1];
        for (int i = 0; i < n; i++) {
            x[i] = scanner.nextInt();
        }

        return x;
    }
}
