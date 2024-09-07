package Lecture03;

public class DispalyArr {
    static void display(int arr[], int i) {
        for (i = 0; i <= arr.length - 1; i++)
            System.out.println(arr[i] + "");
        System.out.println();

        // ---for each loop--

        // for (int i : arr)

        // System.out.print(i + " ");
    }

    public static void main(String[] args) {
        int[] arr = { 8, 2, 1, 3, 4, 5 };
        display(arr, 3);
    }
}
