package Practice;

public class Bsearch {

    public static int binarySearch(int[] arr, int key) {
        int low = 0;
        int high = arr.length - 1;

        while (low <= high) {
            int mid = low + (high - low) / 2; // Find the middle index

            // Check if key is present at mid
            if (arr[mid] == key) {
                return mid;
            }

            // If key is greater, ignore the left half
            if (arr[mid] < key) {
                low = mid + 1;
            }
            // If key is smaller, ignore the right half
            else {
                high = mid - 1;
            }
        }

        // Return -1 if the element is not found
        return -1;
    }

    public static void main(String[] args) {
        int[] sortedArray = { 10, 15, 23, 45, 70, 89 };
        int key = 45;
        int result = binarySearch(sortedArray, key);

        if (result == -1) {
            System.out.println("Element not found in the array.");
        } else {
            System.out.println("Element found at index: " + result);
        }
    }

}
