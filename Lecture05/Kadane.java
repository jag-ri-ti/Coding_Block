package Lecture05;

public class Kadane {
    // generate subarray
    // calc the sum
    // compare in
    // 2. can use only 2 array?
    // 3. kadane algo

    static void generatearray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {
                for (int k = i; k <= j; k++) {
                    System.out.print(arr[k] + " ");
                }
                System.out.println();
            }
        }
    }

    static int findMAxSum(int[] arr) {

        int maxSum = 0;

        for (int i = 0; i < arr.length; i++) {

            for (int j = i; j < arr.length; j++) {
                int tempSum = 0;

                for (int k = i; k <= j; k++) {
                    tempSum += arr[k];
                }
                maxSum = Math.max(maxSum, tempSum);
                System.out.println();
            }
        }
        return maxSum;
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 5, 4, 6 };
        // generatearray(arr);
        System.out.println(findMAxSum(arr));
    }
}
