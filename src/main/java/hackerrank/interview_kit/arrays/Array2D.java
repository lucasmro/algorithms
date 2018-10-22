package hackerrank.interview_kit.arrays;

public class Array2D {

    static int hourglassSum(int[][] arr) {
        int maxSum = Integer.MIN_VALUE;

        for (int col = 0; col < 4; col++) {
            for (int row = 0; row < 4; row++) {
                int sum = arr[row][col] + arr[row][col + 1] + arr[row][col + 2] +
                        arr[row + 1][col + 1] +
                        arr[row + 2][col] + arr[row + 2][col + 1] + arr[row + 2][col + 2];

                if (sum > maxSum) {
                    maxSum = sum;
                }
            }
        }

        return maxSum;
    }

    public static void main(String[] args) {
        int[][] arr = {
                { 1, 1, 1, 0, 0, 0 },
                { 0, 1, 0, 0, 0, 0 },
                { 1, 1, 1, 0, 0, 0 },
                { 0, 0, 2, 4, 4, 0 },
                { 0, 0, 0, 2, 0, 0 },
                { 0, 0, 1, 2, 4, 0 },
        };

        int result = hourglassSum(arr);

        System.out.println(result);
    }
}
