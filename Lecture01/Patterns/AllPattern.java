//import java.util.*;
package Lecture01.Patterns;

public class AllPattern {
    public static void main(String args[]) {
        // Scanner sc = new Scanner(System.in);
        // int n = sc.nextInt();

        int n = Integer.valueOf(System.console().readLine());

        // ---Right Facing Triangle---
        // for (int i = 1; i <= n; i++) {
        // for (int j = 1; j <= i; j++) {
        // System.out.print("* ");
        // }
        // System.out.println("");
        // }

        // ---Left Facing Triangle---
        // for (int i = 1; i <= n; i++) {

        // for (int k = 1; k <= n - i; k++) {
        // System.out.print(" ");
        // }

        // for (int j = 1; j <= i; j++) {
        // System.out.print("*");
        // }
        // System.out.println(" ");
        // }

        // ---Inverted Right Facing Triangle---
        // for (int i = n; i >= 1; i--) {

        // for (int j = 1; j <= i; j++) {
        // System.out.print("*");
        // }
        // System.out.println("");

        // }

        // ---Inverted Left Facing Triangle---

        // for (int i = n; i >= 1; i--) {
        // for (int k = 1; k <= n - i; k++) {
        // System.out.print(" ");
        // }
        // for (int j = 1; j <= i; j++) {
        // System.out.print("*");
        // }
        // System.out.println();
        // }

        // ---Tree---
        for (int i = 1; i <= n; i++) {

            for (int k = 1; k <= n - i; k++) {
                System.out.print(" ");
            }

            for (int j = 1; j <= i; j++) {
                System.out.print(" *");
            }
            System.out.println("");

        }
        // --fading triangle---
        // for (int i = n; i >= 1; i--) {
        // for (int k = n; k >= n - i; k--) {
        // System.out.print(" ");
        // }

        // for (int j = 1; j <= i; j++) {
        // System.out.print("*");
        // }

        // System.out.println();
        // }

        // for (int i = n; i >= 1; i--) {
        // for (int k = 1; k <= 2 * (n - i); k++) {
        // System.out.print(" ");
        // }

        // for (int j = 1; j <= i; j++) {
        // System.out.print("*");
        // }

        // System.out.println();
        // }

        // --- Square---
        // for (int i = 1; i <= n; i++) {
        // for (int j = 1; j <= n; j++) {
        // if (i == n || i == 1 || j == 1 || j == n) {
        // System.out.print('*');

        // } else {
        // System.out.print(" ");
        // }
        // }
        // System.out.println();

        // }

        // --cross--
        // for (int i = 1; i <= n; i++) {
        // for (int j = 1; j <= n; j++) {
        // if (i == j || i + j == n + 1) {
        // System.out.print("*");
        // } else {
        // System.out.print(" ");
        // }

        // }
        // System.out.println();
        // }
    }
}
