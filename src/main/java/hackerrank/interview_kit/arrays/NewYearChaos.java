package hackerrank.interview_kit.arrays;

public class NewYearChaos {

    static void minimumBribes(int[] q) {
        int count = 0;

        for (int i = 0; i < q.length; i++) {
            // int diff = q[i] - (i + 1);
            int diff = Math.abs(i + 1 - q[i]);

            if (q[i] > i + 1 && diff > 2) {
                System.out.println("Too chaotic");
                return;
            }

            if (q[i] > i + 1) {
                count += diff;
            }
        }

        System.out.println(count);
    }

    public static void main(String[] args) {
        // int[] q = { 2, 1, 5, 3, 4 }; // => 3
        // int[] q = { 2, 5, 1, 3, 4 }; // Too chaotic
        // int[] q = { 5, 1, 2, 3, 7, 8, 6, 4 }; // Too chaotic
        int[] q = { 1, 2, 5, 3, 7, 8, 6, 4 }; // 7

        minimumBribes(q);
    }
}
