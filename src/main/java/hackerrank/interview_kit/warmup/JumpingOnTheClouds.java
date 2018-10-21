package hackerrank.interview_kit.warmup;

import java.io.IOException;
import java.util.Scanner;

public class JumpingOnTheClouds {

    static int jumpingOnClouds(int[] c) {
        int n = c.length;
        int jumps = 0;

        for (int i = 0; i <= n - 2; i++) {
            jumps++;

            if ((i < n - 2) && (c[i + 2] == 0)) {
                i++;
            }
        }

        return jumps;
    }

    public static void main(String[] args) throws IOException {

        Scanner in = new Scanner(System.in);

        final int n = in.nextInt();
        in.nextLine();

        final String[] items = in.nextLine().split(" ");

        int[] c = new int[n];
        for (int i = 0; i < n; i++) {
            c[i] = Integer.parseInt(items[i]);
        }

        int result = jumpingOnClouds(c);

        System.out.println(result);
    }
}
