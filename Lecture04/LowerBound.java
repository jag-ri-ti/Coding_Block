package Lecture04;

public class LowerBound {

    static int lowerbound(int[] arr, int num) {
        int low = 0, high = arr.length - 1;
        int ans = 0;
        while (low <= high) {
            int mid = (low + high / 2);
            if (arr[mid] == num) {
                ans = mid;
                high = mid - 1;
            } else if (arr[mid] > num) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }

        }
        return ans;
    }

    public static void main(String[] args) {
        int[] arr = {};
        System.out.println(arr);
    }
}
