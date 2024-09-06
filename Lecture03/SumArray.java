package Lecture03;

public class SumArray {
    static int sum(int arr[]) {
        int sum = 0;
        for (int i : arr) {
            sum += i;
        }
        return sum;
    }

    public static void main(String[] args) {
        int[] arr = { 8, 2, 1, 3, 4, 5 };
        int add = sum(arr);
        System.out.println(add);

    }
}