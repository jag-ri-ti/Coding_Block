package Lecture03;

public class ReverseArr {
    static void printRev(int[] arr) {
        for (int i = arr.length - 1; i >= 0; i--) {
            System.out.print(arr[i] + " ");

        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] arr = { 8, 2, 1, 3, 4, 5 };
        printRev(arr);

    }
}
