package Array_1d;

import java.util.Scanner;

public class Power {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int price[] = new int[n + 1];
        for (int i = 1; i < n + 1; i++) {
            price[i] = scan.nextInt();
        }
        int labor[] = new int[n + 1];
        for (int i = 1; i < n + 1; i++) {
            labor[i] = scan.nextInt();
        }
        int power[] = new int[n + 1];
        for (int i = 1; i < n + 1; i++) {
            power[i] = scan.nextInt();
        }
        int Q = scan.nextInt();
        for (int i = 1; i < Q + 1; i++) {
            int K = scan.nextInt();
            int M = scan.nextInt();
            int side = K / 2;
            int sum_price = 0;
            int sum_price2 = 0;
            int sum_price3 = 0;
            int sum_price4 = 0;
            int count = 0;
            int count_p = 0;
            if (M - side > 0 && M + side <= n) {
                for (int j = M - side; j <= M + side; j++) {
                    sum_price += price[j];
                    if (labor[j] < 5) {
                        count++;
                    }
                    if (power[j] == 1) {
                        count_p++;
                    }
                }
                if (count == 0) {
                    System.out.print(sum_price + " ");
                    System.out.print("labor");
                    if (count_p > 0) {
                        System.out.println(" " + "power");
                    } else {
                        System.out.println("");
                    }
                }
                if (count > 0) {
                    System.out.print(sum_price);
                    if (count_p > 0) {
                        System.out.println(" " + "power");
                    } else {
                        System.out.println("");
                    }
                }

            }

            else if (M + side > n) {
                for (int j = M - side; j < n + 1; j++) {
                    sum_price2 += price[j];
                }
                System.out.print("no" + " " + (sum_price2));
                System.out.println("");
            }

            else if (M - side <= 0) {
                for (int j = 1; j <= M + side; j++) {
                    sum_price3 += price[j];
                }
                System.out.print("no" + " " + (sum_price3));
                System.out.println("");
            }

            else {
                for (int j = 1; j <= n; j++) {
                    sum_price4 += price[j];
                }
                System.out.print("no" + " " + (sum_price4));
                System.out.println("");
            }

        }
    }
}
