package Lecture09;

public class ArrayofArray {

    static void Inputval(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = (arr[0].length * i) + (j + 1);
            }
        }
    }

    public static void Display(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }

            System.out.println();
        }
    }

    public static void main(String[] args) {
        int[][] arr = new int[3][4];

        // int number = 1;

        // for (int i = 0; i < arr.length; i++) {
        // for (int j = 0; j < arr[i].length; j++) {
        // arr[i][j] = number;
        // number++;
        // }
        // }
        Inputval(arr);
        Display(arr);
    }
    // }

}
