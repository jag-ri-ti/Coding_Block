package Lecture07;

public class BS_ques {

    // Binary search function
    public static int binarySearch(int[] arr, int target) {
        int low = 0;
        int high = arr.length - 1;

        // Iterate while the search space is not exhausted
        while (low <= high) {
            int mid = low + (high - low) / 2; // Avoids overflow for large values of low and high

            // Check if the mid element is the target
            if (arr[mid] == target) {
                return mid; // Return the index of the target element
            }
            // If the target is greater than the mid element, eliminate the left half
            else if (arr[mid] < target) {
                low = mid + 1;
            }
            // If the target is smaller than the mid element, eliminate the right half
            else {
                high = mid - 1;
            }
        }

        return -1; // Return -1 if the target is not found
    }

    public static void main(String[] args) {
        int[] arr = { 1, 3, 5, 7, 9, 11, 13, 15 }; // Sorted array
        int target = 7; // Target element to search for

        // Perform binary search
        int result = binarySearch(arr, target);

        if (result != -1) {
            System.out.println("Element found at index: " + result);
        } else {
            System.out.println("Element not found.");
        }
    }

}
