package exercise1;

import java.util.Random;
import java.util.Scanner;

public class Bai5 {
    public static void main(String[] args) {
        int input;
        Scanner scanner = new Scanner(System.in);
        input = scanner.nextInt();
        int count = 0;
        Random random = new Random();
        while (true) {
            int randNumber = random.nextInt(100); // [0,99]
            count++;
            System.out.println("Random number: " + randNumber + ", input: " + input);
            if (randNumber == input) {
                System.out.println("Thuc hien " + count + " lan.");
                break;
            }
        }
    }
}
