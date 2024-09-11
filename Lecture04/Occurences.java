package Lecture04;

public class Occurences {

    static boolean bSearch(int[] arr, int n) {
        int count = 0;
        int low = 0, high = arr.length - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (arr[mid] == n) {
                count += 1;
                return true;
            } else if (arr[mid] < n) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
            return false;
        }
        return false;
    }

    public static void main(String[] args) {
        int[] arr = { 11, 4, 4, 5, 6, 7, };
        System.out.println(bSearch(arr, 5));
    }
}
