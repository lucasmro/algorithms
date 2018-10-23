package hackerrank.interview_kit.arrays;

public class NewYearChaos {

    static void minimumBribes(int[] q) {
        int result = 0;

        for (int i = q.length - 1; i >= 0; i--) {
            if (q[i] - (i + 1) > 2) {
                System.out.println("Too chaotic");
                return;
            }

            for (int j = Math.max(0, q[i] - 2); j < i; j++) {
                if (q[j] > q[i]) {
                    result++;
                }
            }
        }

        System.out.println(result);
    }

    public static void main(String[] args) {
        // int[] q = { 2, 1, 5, 3, 4 }; // => 3
        // int[] q = { 2, 5, 1, 3, 4 }; // Too chaotic
        // int[] q = { 5, 1, 2, 3, 7, 8, 6, 4 }; // Too chaotic
        int[] q = { 1, 2, 5, 3, 7, 8, 6, 4 }; // 7

        minimumBribes(q);
    }
}
