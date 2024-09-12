package Lecture05;

public class Kadanealgo {

    static int Kadane(int[] arr) {
        int Sum = 0;
        int Max = 0;
        for (int i = 0; i < arr.length; i++) {
            Sum += arr[i];
            if (Sum > Max) {
                Max = Sum;
            }
            if (Sum < 0) {
                Sum = 0;
            }
        }
        return Max;
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, -2, -2, 4 };
        System.out.println(Kadane(arr));
    }
}
