package Array_1d;

import java.util.Scanner;

public class Quiz1_1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scan.nextInt();
        }
        int k = scan.nextInt();
        if (k >= 0 && k < n) {
            for (int i = 0; i < n; i++) {
                if (i == k) {
                    System.out.println(arr[i]);
                }
            }
        } else {
            System.out.println("-1");
        }
    }
}
