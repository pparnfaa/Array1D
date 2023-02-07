package Array_1d;

import java.util.Scanner;

public class Quiz1_3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scan.nextInt();
        }
        int count = 0;
        int max = 0;
        for (int j = 0; j < 2; j++) {
            int k = scan.nextInt();
            if (k >= 0 && k < n) {
                for (int i = 0; i < n; i++) {
                    if (i == k) {
                        System.out.println(arr[i]);
                        if (arr[i] > max) {
                            max = arr[i];
                        }
                    }
                }
                count++;
            } else {
                System.out.println("-1");
            }
        }
        if (count > 0) {
            System.out.println(max);
        } else {
            System.out.println("no");
        }
    }
}
