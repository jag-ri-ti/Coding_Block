package Lecture03;

public class SwapElement {
    static void swap(int arr[], int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    static void display(int arr[]) {
        for (int i : arr)
            System.out.print(i + " ");
    }

    public static void main(String[] args) {
        int[] num = { 8, 1, 2, 3, 4, 5 };
        swap(num);
    }

}
