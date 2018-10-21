package hackerrank.interview_kit.warmup;

import java.io.IOException;
import java.util.Scanner;

public class RepeatedString {

    static long repeatedString(String s, long n) {
        int len = s.length();
        int count = 0;

        for (int i = 0; i < len; i++) {
            if (s.charAt(i) == 'a') {
                count++;
            }
        }

        long div = n / len;
        long result = div * count;
        long rem = n % len;

        if (rem != 0) {
            for (int i = 0; i < rem; i++) {
                if (s.charAt(i) == 'a') {
                    result++;
                }
            }
        }

        return result;
    }

    public static void main(String[] args) throws IOException {
        final Scanner in = new Scanner(System.in);

        final String s = in.nextLine();
        final long n = in.nextLong();

        long result = repeatedString(s, n);

        System.out.println(result);
    }
}
