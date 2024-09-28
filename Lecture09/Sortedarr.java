package Lecture09;

import java.util.*;

public class Sortedarr {

    public static void Display(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }

            System.out.println();
        }
    }

    public static void flatsort(int[][] arr) {
        int row = arr.length;
        int col = arr[0].length;
        int[] num = new int[row * col];

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                num[col * i + j] = arr[i][j];
            }
        }
        Arrays.sort(num);

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                arr[i][j] = num[col * i + j];
            }
        }
    }

    public static void sort(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            Arrays.sort(arr[i]);
        }
    }

    public static void main(String[] args) {
        int[][] arr = { { 4, 3, 6, 5 }, { 9, 3, 0, 23 }, { 12, 7, 4, 98 } };
        flatsort(arr);
        sort(arr);
        Display(arr);

    }
}