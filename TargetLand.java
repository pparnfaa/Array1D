package Array_1d;

import java.util.Scanner;

public class TargetLand {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int price[] = new int[n + 1];
        for (int i = 1; i < n + 1; i++) {
            price[i] = scan.nextInt();
        }
        int Q = scan.nextInt();
        for (int i = 1; i < Q + 1; i++) {
            int K = scan.nextInt();
            int M = scan.nextInt();
            int side = K / 2;
            int sum_price = 0;
            if (M - side > 0 && M + side <= n) {
                for (int j = M - side; j <= M + side; j++) {
                    sum_price += price[j];
                }
                System.out.println(sum_price);
            } else {
                System.out.println("no");
            }

        }

    }
}
