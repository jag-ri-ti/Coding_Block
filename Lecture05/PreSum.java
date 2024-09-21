package Lecture05;

// public class PreSum() {

//     int[] preSum=new int[n+1];for(
//     int i = 1;i<arr[i-1];i++)
//     {
//         presum[i] = arr[i - 1] + preSum[i - 1];
//     }

// }

import java.util.Arrays;

public class PreSum {

    // Function to compute the prefix sum array
    public static int[] computePrefixSum(int[] arr) {
        int n = arr.length;
        int[] prefixSum = new int[n];

        // Initialize the first element of prefixSum
        prefixSum[0] = arr[0];

        // Compute prefix sum array
        for (int i = 1; i < n; i++) {
            prefixSum[i] = prefixSum[i - 1] + arr[i];
        }

        return prefixSum;
    }

    // Function to calculate sum of elements between indices l and r (inclusive)
    public static int rangeSum(int[] prefixSum, int l, int r) {
        if (l == 0) {
            return prefixSum[r];
        } else {
            return prefixSum[r] - prefixSum[l - 1];
        }
    }

    public static void main(String[] args) {
        int[] arr = { 2, 8, 3, 9, 6, 5, 4 }; // Example array

        // Compute prefix sum array
        int[] prefixSum = computePrefixSum(arr);

        System.out.println("Prefix Sum Array: " + Arrays.toString(prefixSum));

        // Example: Calculate sum of elements from index 1 to 4 (inclusive)
        int l = 1, r = 4;
        int sum = rangeSum(prefixSum, l, r);

        System.out.println("Sum of elements between index " + l + " and " + r + ": " + sum);
    }
}
