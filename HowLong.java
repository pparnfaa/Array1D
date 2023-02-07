package Array_1d;

import java.util.Scanner;

public class HowLong {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int arr[] = new int[n + 1];
        for (int i = 1; i < n + 1; i++) {
            arr[i] = scan.nextInt();
        }
        for (int i = 1; i <= 3; i++) {
            int num = scan.nextInt();
            int sum = 0;
            int count = 0;
            if (arr[num] != 0) {
                for (int j = num; j < n + 1; j++) {
                    if (arr[j] == 0) {
                        break;
                    }
                    sum++;
                    count++;
                }
            }
            if (count == 0) {
                System.out.println("0");
            } else {
                System.out.println(sum);
            }

        }
    }
}
