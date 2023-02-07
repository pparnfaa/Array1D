package Array_1d;

import java.util.Scanner;

public class OutBound {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int arr[] = new int[n + 1];
        for (int i = 1; i < n + 1; i++) {
            arr[i] = scan.nextInt();
        }
        int x1 = scan.nextInt();
        int x2 = scan.nextInt();
        int count = 0;
        for (int i = 1; i < n + 1; i++) {
            if (arr[i] < x1 || arr[i] > x2) {
                count++;
                System.out.print(arr[i] + " ");
            }
        }
        if (count == 0) {
            System.out.println("no data");
        }
    }
}
