package Array_1d;

import java.util.Scanner;

public class Box2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int box[] = new int[n + 1];
        for (int i = 1; i < n + 1; i++) {
            box[i] = scan.nextInt();
        }
        int k = scan.nextInt();
        int count[] = new int[n + 1];
        for (int i = 1; i < k + 1; i++) {
            int type = scan.nextInt();
            int num = scan.nextInt();
            int wbox = scan.nextInt();
            if (type == 1) {
                count[wbox] += num;
                if (count[wbox] <= box[wbox]) {
                    System.out.println(count[wbox]);
                } else {
                    count[wbox] -= num;
                    System.out.println("-1");
                }
            }
            if (type == 2) {
                int num_2 = scan.nextInt();

            }
        }
    }
}
