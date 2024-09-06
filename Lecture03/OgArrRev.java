package Lecture03;

public class OgArrRev {
    static void ArrRev(int[] arr) {
        int[] temp = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            temp[arr.length - 1 - i] = arr[i];
        }

        for (int i = 0; i < arr.length; i++) {
            arr[i] = temp[i];
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

    }

    public static void main(String[] args) {
        int[] ele = { 8, 1, 2, 3, 4, 5 };
        ArrRev(ele);

    }
}
