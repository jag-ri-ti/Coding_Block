package Assignment01;

import java.util.*;

public class Pattern {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Number of Rows :");
        int n = sc.nextInt();

        System.out.print("Choose the Pattern No. :");
        int r = sc.nextInt();

        switch (r) {
            case 1:
                for (int i = 1; i <= n; i++) {
                    for (int j = 1; j <= n; j++)
                        System.out.print("*");

                    System.out.println();
                }
                break;

            case 2:
                for (int i = 0; i <= n; i++) {
                    for (int j = 0; j <= i; j++) {
                        System.out.print("*");
                    }
                    System.out.println("");
                }
                break;

            case 3:
                for (int i = 1; i <= n; i++) {
                    for (int j = n; j >= i; j--) {
                        System.out.print("*");
                    }
                    System.out.println("");
                }

                break;

            case 4:
                for (int i = 0; i < n; i++) {

                    for (int k = 0; k <= n - i; k++) {
                        System.out.print(" ");
                    }

                    for (int j = 0; j <= i; j++) {
                        System.out.print("*");
                    }
                    System.out.println("");
                }
                break;

            case 5:
                for (int i = n; i >= 1; i--) {
                    for (int k = 1; k <= n - i; k++) {
                        System.out.print(" ");
                    }
                    for (int j = 1; j <= i; j++) {
                        System.out.print("*");
                    }
                    System.out.println();

                }
            case 6:

                for (int i = 1; i <= n; i++) {
                    for (int k = 1; k < i; k++) {
                        System.out.print("  ");
                    }

                    for (int j = 1; j <= n - i + 1; j++) {
                        System.out.print("*");
                    }

                    System.out.println("");
                }
                break;

            case 7:
                System.out.print("Number of Columns :");
                int m = sc.nextInt();
                for (int i = 1; i <= n; i++) {

                    for (int j = 1; j <= m; j++) {

                        if (i == 1 || j == 1 || i == n || j == m) {
                            System.out.print("* ");
                        } else {
                            System.out.print("  ");
                        }
                    }
                    System.out.println();
                }
                break;

            case 8:
                for (int i = 1; i <= n; i++) {
                    for (int j = 1; j <= n; j++) {
                        if (i == j || i + j == n + 1) {
                            System.out.print("*");
                        } else {
                            System.out.print(" ");
                        }
                    }
                    System.out.println();

                }
                break;

            case 9:
                for (int i = 1; i <= n; i++) {

                    for (int k = 1; k <= n - i; k++) {
                        System.out.print("   ");
                    }

                    for (int j = 1; j <= i * 2 - 1; j++) {
                        System.out.print(" * ");
                    }

                    System.out.println("");

                }
                break;

            case 10:
                for (int i = 1; i <= n; i++) {

                    for (int k = 1; k <= n - i; k++) {
                        System.out.print(" ");
                    }

                    for (int j = 1; j <= i; j++) {
                        System.out.print(" *");
                    }
                    System.out.println("");

                }
                break;

            case 11:
                for (int i = 1; i <= n; i++) {

                    for (int k = 1; k <= n - i; k++) {
                        System.out.print(" ");
                    }

                    for (int j = 1; j <= i; j++) {
                        System.out.print(" *");
                    }
                    System.out.println("");

                }
                break;
            default:
                System.out.println("I DON'T KNOW!!");
        }
        sc.close();
    }

}
