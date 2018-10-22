package hackerrank.interview_kit.arrays;

public class LeftRotation {

    static int[] rotLeft(int[] a, int d) {
        int result[] = new int[a.length];

        int aux = 0;

        for (int i = d; i < a.length; i++) {
            result[aux++] = a[i];
        }

        for (int i = 0; i < d; i++) {
            result[aux++] = a[i];
        }

        return result;
    }

    public static void main(String[] args) {
        int[] a = { 1, 2, 3, 4, 5 };
        int d = 4;

        int[] result = rotLeft(a, d);

        for (int value : result) {
            System.out.print(String.format("%d ", value));
        }
    }
}
