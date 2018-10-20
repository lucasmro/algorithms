package hackerrank.interview_kit.warmup;

import java.io.IOException;
import java.util.Scanner;

public class CountingValleys {

    static int countingValleys(int n, String s) {
        int level = 0;
        int count = 0;
        boolean valley = false;

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'D') {
                level--;
            } else if (s.charAt(i) == 'U') {
                level++;
            }

            if (level < 0) {
                valley = true;
            }

            if (valley && level == 0) {
                count++;
                valley = false;
            }
        }

        return count;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(System.in);

        final int n = in.nextInt();
        in.nextLine();
        final String s = in.nextLine();

        int result = countingValleys(n, s);

        System.out.println(result);
    }
}
