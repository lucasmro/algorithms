package hackerrank.interview_kit.arrays;

public class NewYearChaos {

    static void minimumBribes(int[] A) {
        int n = A.length;
        int count = 0;

        for (int i = n - 1; i >= 0; i--) {
            if (A[i] == (i + 1)) {
                continue;
            }

            if (((i - 1) >= 0) && A[i - 1] == (i + 1)) {
                count++;
                int tmp = A[i];
                A[i] = A[i - 1];
                A[i - 1] = tmp;
            } else if (((i - 2) >= 0) && A[i - 2] == (i + 1)) {
                count += 2;
                A[i - 2] = A[i - 1];
                A[i - 1] = A[i];
                A[i] = i + 1;
            } else {
                System.out.println("Too chaotic");
                return;
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
