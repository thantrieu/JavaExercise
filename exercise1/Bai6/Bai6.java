package exercise1;

import java.time.LocalDate;
import java.util.Scanner;

public class Bai6 {
    public static void main(String[] args) {
        int n, i;
        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt();

        if(n % 2 ==0){// neu n chan
            i = 2;
        }else{ // n le
            i = 1;
        }
        long sum = 0;
        for(; i <= n; i+= 2){
            sum+= i;
        }
        System.out.println("RESULT = " + sum);
    }
}
