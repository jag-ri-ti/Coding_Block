//import java.util.*;
package Lecture01;

public class Pattern {
    public static void main(String args[]) {
        // Scanner sc = new Scanner(System.in);
        // int n = sc.nextInt();

        int n = Integer.valueOf(System.console().readLine());

        // for (int i = 1; i <= n; i++) {
        // for (int j = 1; j <= i; j++) {
        // System.out.print("* ");
        // }
        // System.out.println("");
        // }

        // *
        // * *
        // * * *
        // * * * *
        // * * * * *
        // for (int i = 1; i <= n; i++) {

        // for (int k = 1; k <= n - i; k++) {
        // System.out.print(" ");
        // }

        // for (int j = 1; j <= i; j++) {
        // System.out.print("* ");
        // }
        // System.out.println("");

        // }

        for (int i = 1; i <= n; i++) {

            for (int k = 1; k <= n - i; k++) {
                System.out.print(" ");
            }

            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println(" ");

        }
    }
}
