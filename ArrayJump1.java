package Array_1d;

import java.util.Scanner;

public class ArrayJump1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int arr[] = new int[n + 1];
        for (int i = 1; i < n + 1; i++) {
            arr[i] = scan.nextInt();
        }
        int sum = 1;
        int count = 0;
        for (int i = 1; i < n + 1; i++) {
            if (count == 5) {
                break;
            }
            if (i == 1) {
                System.out.println("1" + " " + arr[i]);
                sum += arr[i];
                count++;
            } else if (i == sum) {
                System.out.println(i + " " + arr[i]);
                sum += arr[i];
                count++;
            } else if (sum > n) {
                System.out.println("out of bounds");
                break;
            }
        }
    }
}
