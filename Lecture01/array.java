package Lecture01;

import java.util.*;

public class array {
    public static void main(String[] args) {
        // int arr[] = new int[5];

        // arr[0] = 1;
        // arr[1] = 10;
        // // System.out.println(arr[1]);

        // boolean[] nums = new boolean[10];
        // char[] s = new char[3];
        // s[0] = 'a';
        // s[1] = 'b';
        // // System.out.println(s);

        // for (int i = 0; i < nums.length; i++) {
        // System.out.print(nums[i] + " ");
        // }

        int arr[] = new int[10];
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number");
        int n = sc.nextInt();

        for (int i = 0; i < arr.length; i++) {
            arr[i] = i * n;
        }

        System.out.println("Enter number to be searched:");
        int m = sc.nextInt();

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == m) {
                System.out.println(i);
            }
        }
        sc.close();

    }
}
