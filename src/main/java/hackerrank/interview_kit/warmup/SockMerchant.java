package hackerrank.interview_kit.warmup;

import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class SockMerchant {

    static int sockMerchant(int n, int[] ar) {
        Arrays.sort(ar);

        int pairs = 0;
        int last = ar[0];
        int count = 1;

        for (int i = 1; i < ar.length; i++) {
            int current = ar[i];

            if (last == current) {
                count++;
            } else {
                pairs += count / 2;
                last = current;
                count = 1;
            }
        }

        if (count > 1) {
            pairs += count / 2;
        }

        return pairs;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(System.in);

        final int n = in.nextInt();
        in.nextLine();

        final String[] colors = in.nextLine().split(" ");

        int[] ar = new int[n];
        for (int i = 0; i < n; i++) {
            ar[i] = Integer.parseInt(colors[i]);
        }

        int result = sockMerchant(n, ar);

        System.out.println(result);
    }
}
