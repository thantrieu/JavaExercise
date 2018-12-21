import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Bai4 {
    public static void main(String[] args) {
        int [] arr;
        int n;
        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt();
        Random random = new Random();
        arr =  new int[n];
        int count = 0;// dem
        while (count < n){// dem so cac so ngau nhien da dc sinh ra
            arr[count++] =random.nextInt(100);// gan so ngau nhien cho arr[count]; count++
        }
        int [] brr = new int[n];
        int bSize = 0;
        boolean isExist = false;
        for (int i = 0; i < n; i++) {
            isExist = false;
            for (int j = 0; j < bSize; j++) {
                if(arr[i] == brr[j]){
                    isExist = true;
                    break;
                }
            }
            if (!isExist){
                brr[bSize++] = arr[i];
            }
        }

        System.out.println("Truoc khi sap xep: ");
        System.out.println(Arrays.toString(arr));
        // thao tac 1
        Arrays.sort(arr);
        System.out.println("Sau khi sap xep: ");
        System.out.println(Arrays.toString(arr));
        // thao tac 2
        brr = Arrays.copyOfRange(brr, 0, bSize);
        Arrays.sort(brr); // cat bo cac phan tu du thua
        System.out.println("Mang chi chua cac phan tu duy nhat: ");
        System.out.println(Arrays.toString(brr));
    }
}
