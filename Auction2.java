package Array_1d;

import java.util.Scanner;

public class Auction2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int a[] = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = scan.nextInt();
        }
        int k = scan.nextInt();
        int b[][] = new int[k][n];
        for (int i = 0; i < k; i++) {
            for (int j = 0; j < n; j++) {
                b[i][j] = scan.nextInt();
            }
        }
        int count[] = new int[n];
        for (int i = 0; i < k; i++) {
            for (int j = 0; j < n; j++) {
                if (b[i][j] <= a[j]) {
                    System.out.print(a[j] + " ");
                    count[j]++;
                }
                if (b[i][j] > a[j]) {
                    if (count[j] >= 3) {
                        System.out.print(a[j] + " ");
                    } else {
                        count[j] = 0;
                        System.out.print(b[i][j] + " ");
                        a[j] = b[i][j];
                    }
                }
            }
            System.out.println("");
        }
    }
}
