package Lecture04;

public class UpperBond {
    static int upperBound(int[] arr, int num) {
        int low = 0, high = arr.length - 1;
        int ans = arr.length;
        while (low < high) {
            int mid = (low + high) / 2;
            if (arr[mid] == num) {
                ans = mid + 1;
                low = mid + 1;
            } else if (arr[mid] < num) {
                low = mid + 1;
            } else {
                ans = mid;
                high = mid - 1;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] arr = { 1, 1, 2, 2, 2, 2, 3, 3, 3, 3, 3, 4, 4, 4, 6, 8, 9 };
        System.out.println(upperBound(arr, 3));
    }
}
