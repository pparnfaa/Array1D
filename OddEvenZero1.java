package Array_1d;

import java.util.Scanner;

public class OddEvenZero1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int arr[] = new int[n + 1];
        for (int i = 1; i < n + 1; i++) {
            arr[i] = scan.nextInt();
        }
        int brr[] = new int[n + 1];
        int crr[] = new int[n + 1];
        int count_1 = 1, count_2 = 1;
        for (int i = 1; i < n + 1; i++) {
            if (arr[i] % 2 != 0 || arr[i] == 0) {
                crr[count_2] = arr[i];
                count_2++;
            }
            if (arr[i] % 2 == 0 || arr[i] == 0) {
                brr[count_1] = arr[i];
                count_1++;
            }

        }
        for (int i = 1; i < count_2; i++) {
            System.out.print(crr[i] + " ");

        }
        System.out.println("");
        for (int i = 1; i < count_1; i++) {
            System.out.print(brr[i] + " ");
        }
    }

}
