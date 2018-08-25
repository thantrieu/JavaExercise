package exercise2;

import java.util.Scanner;

public class Bai1 {
    public static void main(String[] args) {
        int[] arr;
        int n;
        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt();
        arr = new int[n];
        for(int i = 0; i< n; i++){
            arr[i] = scanner.nextInt();
        }
        // ktra doi xung
        boolean ok = true;
        int mid = n/2;
        int x;
        for(int i = 0; i<= mid; i++){
            x = n-1-i;
            if(arr[i] != arr[x]){
                ok = false;
                break;
            }
        }
        if(ok == true){
            System.out.println("Mang doi xung.");
        }
        else{
            System.out.println("Mang khong doi xung.");
        }
    }
}
