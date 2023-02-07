package Array_1d;

import java.util.Scanner;

public class ArrayJump2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int k = scan.nextInt();
        int arr[] = new int[n + 1];
        for (int i = 1; i < n + 1; i++) {
            arr[i] = scan.nextInt();
        }
        int sum = k;
        for (int i = 1; i < n + 1; i++) {
            if (i == k) {
                System.out.println(i + " " + arr[i]);
                sum += arr[i];
            } else if (i == sum) {
                System.out.println(sum + " " + arr[i]);
                sum += arr[i];
            } else if (sum > n) {
                System.out.println("out of bounds");
                break;
            }
        }
    }
}
